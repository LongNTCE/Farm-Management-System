/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import dao.cropDAO;
import dao.pondDAO;
import entity.Crop;
import entity.CropEmployeeAuthorization;
import entity.Employee;
import entity.FacilityBreed_Record;
import entity.FacilityOwner;
import entity.Facility_Employee;
import entity.Pond;
import entity.PondEmployeeAuthorization;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class FacilityEmployeeDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Employee> getEmployeefID(int facilityID) {
        List<Employee> fEmployeeList = new ArrayList<>();
        String query = "SELECT * FROM `employee` INNER JOIN `facility - employee` ON `employee`.employeeID = `facility - employee`.employeeID where `facility - employee`.facilityID = ?";
        //  SELECT * FROM pond INNER JOIN crop - pond ON pond.pondID = crop - pond.pondID where crop - pond.cropID = ?
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, facilityID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                fEmployeeList.add(new Employee(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                ));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return fEmployeeList;
    }

    public void signupEmployee(String username, String email, String phoneNum, String password) {
        String query = "INSERT INTO `employee` (`employeeFullName`, `employeeEmail`, `employeePassword`, `employeePhone`) VALUES (?, ?, ?, ?)";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, phoneNum);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public PondEmployeeAuthorization getPondEmployeeAuthorizationByEIDPID(int eID, int pID) {
        PondEmployeeAuthorization pEA = null;
        String query = "SELECT * FROM pond_employee_authorization WHERE employeeID = ? AND pondID = ? LIMIT 1";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, eID);
            ps.setInt(2, pID);
            rs = ps.executeQuery();
            while (rs.next()) {
                pEA = new PondEmployeeAuthorization(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getBoolean(4),
                        rs.getBoolean(5),
                        rs.getBoolean(6));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pEA;
    }

    public void deleteFacilityEmployee(int employeeID) {
        String query = "DELETE FROM `facility - employee` WHERE employeeID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, employeeID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong");
        } catch (Exception e) {
            System.out.println("Delete Fail");
        }
    }

    public void deleteFacilityEmployeeByFID(int fID) {
        String query = "DELETE FROM `facility - employee` WHERE facilityID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong");
        } catch (Exception e) {
            System.out.println("Delete Fail");
        }
    }
//    public void deleteEmployee(int employeeID) {
//        String query = "DELETE FROM employee WHERE employeeID = ?";
//
//        try {
//            conn = DBContext.getConnection();       // call function form DBconnection
//            ps = conn.prepareStatement(query);
//            ps.setInt(1, employeeID);
//            ps.executeUpdate();
//            System.out.println("Delete Thanh cong");
//        } catch (Exception e) {
//            System.out.println("Delete Fail");
//        }
//
//    }

    public void addFacilityEmployee(int facilityID, int employeeID) {
        String query = "INSERT INTO `facility - employee`( facilityID`, employeeID, allowFInventory) VALUES ( ?, ?, 0)";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, facilityID);
            ps.setInt(2, employeeID);
            System.out.println("Add facility employee Thanh Cong");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add facility employee Fail CMNR");
        }
    }

    public void addEmployeeToFacility(int fID, String email) {
        int eID = -1;
        String query = "SELECT `employeeID` from employee where employeeEmail = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                eID = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add employee Fail CMNR");
        }
        String query1 = "INSERT INTO `facility - employee` (facilityID, employeeID) VALUES (?, ?);";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query1);
            ps.setInt(1, fID);
            ps.setInt(2, eID);
            ps.executeUpdate();
            initEmployeeAuthorizationForCrop(eID, fID);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add employee Fail CMNR");
        }
    }

    public void initEmployeeAuthorizationForCrop(int eID, int fID) {
        cropDAO cropDAO = new cropDAO();
        pondDAO pondDAO = new pondDAO();
        List<Crop> cropList = cropDAO.getCropByFacilityID(fID);
        for (Crop c : cropList) {
            int CEAID = -1;
            String query = "SELECT * FROM crop_employee_authorization WHERE cropID = ? AND employeeID = ? LIMIT 1;";
            try {
                conn = DBContext.getConnection();       // call function form DBconnection
                ps = conn.prepareStatement(query);
                ps.setInt(1, c.getCropID());
                ps.setInt(2, eID);
                rs = ps.executeQuery();
                while (rs.next()) {
                    CEAID = rs.getInt(1);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            if (CEAID == -1) {
                String query1 = "INSERT INTO crop_employee_authorization (cropID, employeeID, allowBreedRecord, allowHarvestRecord, allowInventoryRecord) VALUES (?, ?, '0', '0', '0');";
                try {
                    conn = DBContext.getConnection();       // call function form DBconnection
                    ps = conn.prepareStatement(query1);
                    ps.setInt(1, c.getCropID());
                    ps.setInt(2, eID);
                    ps.executeUpdate();
                    System.out.println("add thanh cong" + ps);
                } catch (Exception e) {
                    System.out.println(e);
                    System.out.println("Add CAID Fail CMNR");
                }
            }
            List<Pond> pondList = pondDAO.getPondByCropID(c.getCropID());
            for (Pond p : pondList) {
                initinitEmployeeAuthorizationForPond(eID, p.getPondID());
            }
        }
    }

    public void initinitEmployeeAuthorizationForPond(int eID, int pID) {
        int PEAID = -1;
        String query = "SELECT * FROM pond_employee_authorization WHERE pondID = ? AND employeeID = ? LIMIT 1;";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pID);
            ps.setInt(2, eID);
            rs = ps.executeQuery();
            while (rs.next()) {
                PEAID = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (PEAID == -1) {
            String query2 = "INSERT INTO pond_employee_authorization (pondID, employeeID, allowInventoryRecord, allowSurvivalRecord, allowWaterRecord) VALUES (?, ?, '0', '0', '0');";
            try {
                conn = DBContext.getConnection();       // call function form DBconnection
                ps = conn.prepareStatement(query2);
                ps.setInt(1, pID);
                ps.setInt(2, eID);
                ps.executeUpdate();
                System.out.println("add thanh cong" + ps);
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Add CAID Fail CMNR");
            }
        }
    }

    public String getEmployeeNamebyEID(int ID) {
        String eFName = null;
        String query = "SELECT employeeFullName FROM employee WHERE employeeID = ?";
        //  SELECT * FROM pond INNER JOIN crop - pond ON pond.pondID = crop - pond.pondID where crop - pond.cropID = ?
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                eFName = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return eFName;
    }

    public List<CropEmployeeAuthorization> getCropEmployeeAuthorization(int eID) {
        List<CropEmployeeAuthorization> list = new ArrayList<>();
        String query = "SELECT * FROM crop_employee_authorization WHERE employeeID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, eID);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new CropEmployeeAuthorization(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getBoolean(4),
                        rs.getBoolean(5),
                        rs.getBoolean(6)
                ));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public CropEmployeeAuthorization getCropEmployeeAuthorizationByEIDCID(int eID, int cID) {
        CropEmployeeAuthorization cEA = null;
        String query = "SELECT * FROM crop_employee_authorization WHERE employeeID = ? AND cropID = ? LIMIT 1";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, eID);
            ps.setInt(2, cID);
            rs = ps.executeQuery();
            while (rs.next()) {
                cEA = new CropEmployeeAuthorization(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getBoolean(4),
                        rs.getBoolean(5),
                        rs.getBoolean(6));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return cEA;
    }

    public PondEmployeeAuthorization getPondEmployeeAuthorizationByEIDCID(int eID, int pID) {
        PondEmployeeAuthorization pEA = null;
        String query = "SELECT * FROM pond_employee_authorization WHERE employeeID = ? AND pondID = ? LIMIT 1";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, eID);
            ps.setInt(2, pID);
            rs = ps.executeQuery();
            while (rs.next()) {
                pEA = new PondEmployeeAuthorization(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getBoolean(4),
                        rs.getBoolean(5),
                        rs.getBoolean(6));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pEA;
    }

    public void updateCA(boolean allowB, boolean allowH, boolean allowI, int eID, int cID) {
        String query = "UPDATE crop_employee_authorization SET allowBreedRecord = ?, allowHarvestRecord = ?, allowInventoryRecord = ? WHERE crop_employee_authorization.`employeeID` = ? AND crop_employee_authorization.`cropID`= ?;";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setBoolean(1, allowB);
            ps.setBoolean(2, allowH);
            ps.setBoolean(3, allowI);
            ps.setInt(4, eID);
            ps.setInt(5, cID);
            ps.executeUpdate();
            System.out.println(ps);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public void updatePA(boolean allowPI, boolean allowS, boolean allowW, int eID, int pID) {
        String query = "UPDATE pond_employee_authorization SET allowInventoryRecord = ?, allowSurvivalRecord = ?, allowWaterRecord = ? WHERE pond_employee_authorization.`employeeID` = ? AND pond_employee_authorization.`pondID`= ?;";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setBoolean(1, allowPI);
            ps.setBoolean(2, allowS);
            ps.setBoolean(3, allowW);
            ps.setInt(4, eID);
            ps.setInt(5, pID);
            ps.executeUpdate();
            System.out.println(ps);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    //CHECK EXIST
    public String[] checkEmployeeExist(String user, String phone) {
        String[] error = new String[3];
        error[0] = "thanh cong";
        String query1 = "SELECT * FROM employee WHERE employeeEmail = ?";
        try {
            conn = new DBContext().getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query1);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                error[1] = "email da co";
                error[0] = "cac";
            }
        } catch (Exception e) {

        }
        String query2 = "SELECT * FROM employee WHERE employeePhone = ?";
        try {
            conn = new DBContext().getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query2);
            ps.setString(1, phone);
            rs = ps.executeQuery();
            while (rs.next()) {
                error[2] = "phone da co";
                error[0] = "cac2";
            }
        } catch (Exception e) {

        }
        
        return error;
    }

    public static void main(String[] args) {
        cropDAO cropDAO = new cropDAO();
        FacilityEmployeeDAO dao = new FacilityEmployeeDAO();
     //   dao.updateCA(false, true, false, 14, 3);
        String[] concu = dao.checkEmployeeExist("av@gmail.com", "0987654321");
        System.out.println(concu[2]);
    }
}
