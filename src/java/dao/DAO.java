/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Crop;
import entity.Employee;
import entity.Facility;
import entity.FacilityInventory_Record;
import entity.Pond;
import entity.FacilityOwner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public FacilityOwner loginFO(String email, String password) {
        String query;
        query = "SELECT * FROM `facilityowner` WHERE foEmail = ? AND foPassword = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new FacilityOwner(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                );
            }
        } catch (Exception e) {

        }
        return null;
    }

    public Employee loginE(String username, String password) {
        String query;
        query = "SELECT * FROM `employee` WHERE employeeEmail = ? AND employeePassword = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Login thanh cong");
                return new Employee(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void signupFO(String username, String email, String phoneNum, String password) {
        String query = "INSERT INTO `facilityowner`(`foFullName`, `foEmail`, `foPhone`, `foPassword`) VALUES (?, ?, ?, ?)";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, phoneNum);
            ps.setString(4, password);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

//    public List<Facility> getAllFarm() {
//        List<Facility> farmList = new ArrayList<>();
//        ResultSet resultSet = DBContext.querySet("SELECT * FROM `farm`");
//        if (resultSet != null) {
//            try {
//                while (resultSet.next()) {
//                    farmList.add(new Facility(
//                            resultSet.getInt(1),
//                            resultSet.getInt(2),
//                            resultSet.getString(3),
//                            resultSet.getString(4),
//                            resultSet.getDouble(5)
//                    ));
//                    System.out.println("[Debug]Day data thanh cong");
//                }
//            } catch (Exception e) {
//                System.out.println("[Debug]Day data Fail");
//            }
//        }
//        return farmList;
//    }
    public Facility getFacilityByFID(int facilityID) {
        String query = "SELECT * FROM `facility` WHERE facilityID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, facilityID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new Facility(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6),
                        rs.getDouble(7),
                        rs.getDouble(8),
                        rs.getDouble(9),
                        rs.getString(10),
                        rs.getInt(11));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Facility> getFacilityByFOID(int foID) {
        List<Facility> facilityList = new ArrayList<>();
        String query = "SELECT * FROM `facility` WHERE foID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, foID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                facilityList.add(new Facility(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6),
                        rs.getDouble(7),
                        rs.getDouble(8),
                        rs.getDouble(9),
                        rs.getString(10),
                        rs.getInt(11)));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return facilityList;
    }
    
        public List<Facility> getFacilityByEmployeeID(int employeeID) {
        List<Facility> facilityList = new ArrayList<>();
        String query = "SELECT * FROM `facility` JOIN `facility - employee` ON `facility`.`facilityID`=`facility - employee`.`facilityID` WHERE employeeID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, employeeID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                facilityList.add(new Facility(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6),
                        rs.getDouble(7),
                        rs.getDouble(8),
                        rs.getDouble(9),
                        rs.getString(10),
                        rs.getInt(11)));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return facilityList;
    }

    public void addFacility(int foID, String fName, String fAddress, String fPhone, double fCultivatingPondSquare, double fStoragePondSquare, double fWastePondSquare, String fCultivatingObject, int fCultivatingTime, double fTotalSquare) {
        String query = "INSERT INTO `facility`(`foID`,`fName`, `fAddress`, `fPhone`, `fCultivatingPondSquare`, `fStoragePondSquare`, `fWastePondSquare`, `fCultivatingObject`, `fCultivatingTime`,`fTotalSquare`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, foID);
            ps.setString(2, fName);
            ps.setString(3, fAddress);
            ps.setString(4, fPhone);
            ps.setDouble(5, fCultivatingPondSquare);
            ps.setDouble(6, fStoragePondSquare);
            ps.setDouble(7, fWastePondSquare);
            ps.setString(8, fCultivatingObject);
            ps.setInt(9, fCultivatingTime);
            ps.setDouble(10, fTotalSquare);
            System.out.println("Add Farm Thanh Cong");
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Farm Fail CMNR");
        }

    }

    public void addFarmtoUser(int userID, int farmID) {
        String query = "INSERT INTO `user-farm`( `userID`, `farmID`) VALUES ( ?, ?)";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, userID);
            ps.setInt(2, farmID);

            System.out.println("Add farm Thanh Cong");
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add farm Fail CMNR");
        }

    }

    public void deleteFacility(int facilityID) {
        String query = "DELETE FROM `facility` WHERE facilityID = ?";

        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, facilityID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
//INSERT INTO `facility`(`foID`,`fName`, `fAddress`, `fPhone`, `fCultivatingPondSquare`, `fStoragePondSquare`, `fWastePondSquare`, `fCultivatingObject`, `fCultivatingTime`,`fTotalSquare`)
    public void editFacility(int facilityID, String fName, String fAddress, String fPhone, double fCultivatingPondSquare, double fStoragePondSquare, double fWastePondSquare, String fCultivatingObject, int fCultivatingTime, double fTotalSquare) {
        String query = "UPDATE `facility` SET `fName` = ?, `fAddress` = ?, `fPhone` = ?, `fCultivatingPondSquare` = ?, `fStoragePondSquare` = ?, `fWastePondSquare` = ?, `fCultivatingObject` = ?, `fCultivatingTime` = ?, `fTotalSquare` = ? WHERE `facility`.`facilityID` = ?";
        
        //UPDATE `facility` SET `fName` = 'edit2', `fAddress` = 'addedit3', `fPhone` = '000000003', `fCultivatingPondSquare` = '4', `fStoragePondSquare` = '6', `fWastePondSquare` = '7', `fCultivatingObject` = 'cu', `fCultivatingTime` = '151', `fTotalSquare` = '151' WHERE `facility`.`facilityID` = 1
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);

            
            ps.setString(1, fName);
            ps.setString(2, fAddress);
            ps.setString(3, fPhone);
            ps.setDouble(4, fCultivatingPondSquare);
            ps.setDouble(5, fStoragePondSquare);
            ps.setDouble(6, fWastePondSquare);
            ps.setString(7, fCultivatingObject);
            ps.setInt(8, fCultivatingTime);
            ps.setDouble(9, fTotalSquare);
            ps.setInt(10, facilityID);

            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    public void editCrop(int cropID, String cropName, String cropStartDate, String cropEndDate) {
        String query = "UPDATE `crop` SET `cropName` = ?, `cropStartDate` = ?, `cropEndDate` = ? WHERE `crop`.`cropID` = ?";
        
        //UPDATE `facility` SET `fName` = 'edit2', `fAddress` = 'addedit3', `fPhone` = '000000003', `fCultivatingPondSquare` = '4', `fStoragePondSquare` = '6', `fWastePondSquare` = '7', `fCultivatingObject` = 'cu', `fCultivatingTime` = '151', `fTotalSquare` = '151' WHERE `facility`.`facilityID` = 1
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);

            
            ps.setString(1, cropName);
            ps.setString(2, cropStartDate);
            ps.setString(3, cropEndDate);
            ps.setInt(4, cropID);

            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    public void editPond(int pondID, String pondCode, String pondName, Double pondSquare) {
        String query = "UPDATE `pond` SET `pondName` = ?, `pondCode` =?, `pondSquare` = ? WHERE `pond`.`pondID` = ?";
        
        //UPDATE `facility` SET `fName` = 'edit2', `fAddress` = 'addedit3', `fPhone` = '000000003', `fCultivatingPondSquare` = '4', `fStoragePondSquare` = '6', `fWastePondSquare` = '7', `fCultivatingObject` = 'cu', `fCultivatingTime` = '151', `fTotalSquare` = '151' WHERE `facility`.`facilityID` = 1
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);

            
            ps.setString(1, pondName);
            ps.setString(2, pondCode);
            ps.setDouble(3, pondSquare);
            ps.setInt(4, pondID);

            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    

//    public Facility getFarmByID(String farmID) {
//        String query = "SELECT * FROM `farm` WHERE farmID = ?";
//        try {
//            conn = DBContext.getConnection();       // call function form DBconnection
//            ps = conn.prepareStatement(query);
//            ps.setString(1, farmID);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                System.out.println(rs);
//                return new Facility(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getDouble(4));
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return null;
//    }

//    public List<Pond> getAllPond() {
//        List<Pond> pondList = new ArrayList<>();
//        ResultSet resultSet = DBContext.querySet("SELECT * FROM `pond`");
//        if (resultSet != null) {
//            try {
//                while (resultSet.next()) {
//                    pondList.add(new Pond(
//                            resultSet.getInt(1),
//                            resultSet.getString(2),
//                            resultSet.getDouble(3),
//                            resultSet.getDouble(4),
//                            resultSet.getDouble(5)));
//                    System.out.println("[Debug]Day data thanh cong");
//                }
//            } catch (Exception e) {
//                System.out.println("[Debug]Day data Fail");
//            }
//        }
//        return pondList;
//    }

public void addPond(String pondName, String pondCode, double pondSquare) {
        String query = "INSERT INTO `pond`( `pondCode`, `pondName`, `pondSquare`) VALUES (?, ?, ?)";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, pondCode );
            ps.setString(2, pondName);
            ps.setDouble(3, pondSquare);
            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    
    public void addCrop(int facilityID, String cropName, String cropStartDate, String cropEndDate) {
        String query = "INSERT INTO `crop`( `facilityID`, `cropName`, `cropStartDate`, `cropEndDate`) VALUES ( ?, ?, ?, ?);";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, facilityID);
            ps.setString(2, cropName);
            ps.setString(3, cropStartDate);
            ps.setString(4, cropEndDate);

            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }

    }

    public Pond getLastInsertID() {
        String query = "SELECT * FROM `pond` ORDER by pondID desc limit 1";
        try {
            conn = DBContext.getConnection();        // call function form DBconnection
            ps = conn.prepareStatement(query);
            System.out.println(ps);
            rs = ps.executeQuery();
            System.out.println(rs.toString());
            while (rs.next()) {
                return new Pond(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4));
            }
        } catch (Exception e) {
            System.out.println("[Debug]Day data Fail");

        }

        return null;
    }

    public void addPondtoCrop(int cropID, int pondID) {
        String query = "INSERT INTO `crop - pond`( `cropID`, `pondID`) VALUES ( ?, ?)";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cropID);
            ps.setInt(2, pondID);

            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }

    }



    public List<Crop> getAllCrop() {
        List<Crop> cropList = new ArrayList<>();
        ResultSet resultSet = DBContext.querySet("SELECT * FROM `crop`");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    cropList.add(new Crop(
                            resultSet.getInt(1),
                            resultSet.getInt(2),
                            resultSet.getString(3),
                            resultSet.getDate(4),
                            resultSet.getDate(5)));
                    System.out.println("[Debug]Day data thanh cong");
                }
            } catch (Exception e) {
                System.out.println("[Debug]Day data Fail");
            }
        }
        return cropList;
    }

    //CHECK EXIST
   
    
    public String[] checkOwnerExist(String user, String phone) {
        String[] error = new String[3];
        error[0] = "thanh cong";
        String query1 = "SELECT * FROM facilityO WHERE employeeEmail = ?";
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
    
    public int checkAccountExist(String user) {
        String query = "SELECT * FROM `facilityowner` WHERE foEmail = ?";
        try {
            conn = new DBContext().getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return 1;
            }
        } catch (Exception e) {

        }
        return 0;
    }

    public FacilityOwner checkPhoneExist(String user) {
        String query = "SELECT * FROM user WHERE userPhone = ?";
        try {
            conn = new DBContext().getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new FacilityOwner(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                );
            }
        } catch (Exception e) {

        }
        return null;
    }

    public FacilityOwner checkEmailExist(String user) {
        String query = "SELECT * FROM user WHERE userEmail = ?";
        try {
            conn = new DBContext().getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new FacilityOwner(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                );
            }
        } catch (Exception e) {

        }
        return null;
    }

    public FacilityOwner checkPassword(String user) {
        String query = "SELECT `userPassword` FROM user WHERE userName = ?";
        try {
            conn = new DBContext().getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new FacilityOwner(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                );
            }
        } catch (Exception e) {

        }
        return null;
    }

    public FacilityOwner checkUsername(String user) {
        String query = "SELECT * FROM user WHERE userName = ?";
        try {
            conn = new DBContext().getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new FacilityOwner(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                );
            }
        } catch (Exception e) {

        }
        return null;
    }

    public List<FacilityInventory_Record> getFInventoryByFacility(int facilityID) {
        List<FacilityInventory_Record> fInventoryRecordList = new ArrayList<>();
        String query = "SELECT * FROM `facility_inventory_record` WHERE facilityID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, facilityID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                fInventoryRecordList.add(new FacilityInventory_Record(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getDate(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getDate(7),
                        rs.getDate(8)
                ));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return fInventoryRecordList;
    }

    public List<Employee> getEmployeeInFacility(int facilityID) {
        List<Employee> employeeInFacilityList = new ArrayList<>();
        String query = "SELECT * FROM `employee` INNER JOIN `facility-employee` ON `employee`.`employeeID` = `facility-employee`.`employeeID` where `facility-employee`.facilityID =?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, facilityID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                employeeInFacilityList.add(new Employee(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return employeeInFacilityList;
    }

    public static void main(String[] args) {

        DAO dao = new DAO();
//        dao.getFacilityByFID(2);
//dao.addFacility(1, "farm232", "cc", "2", 3, 3, 3, "cu", 2);
//dao.editFacility(1, "edit1v322", "addeditmem", "222222", 9, 9, 9, "cuc", 21, 18);
//dao.editFacility(0, fName, fAddress, fPhone, 0, 0, 0, fCultivatingObject, 0, 0);
//dao.addCrop(1, "jesus", "2022-01-30", "2022-02-16");
//dao.editCrop(11, "buddha","2022-01-27" , "2022-02-19");
//dao.getFacilityByFOID(1);
//dao.editPond(2, "aothao", 30.0);
//dao.editFacility(1, "Edit 1", "asdasd", "0129384594", 12, 234, 21, "asdd", 3, 3);
//dao.addPond("P100", "Pond Test Add", 234324);\
//        if(dao.checkAccountExist1("long123@gmail.com") == 1){
//            System.out.println("Có acc");
//        }else if(dao.checkAccountExist1("long123@gmail.com") == 0){
System.out.println(dao.loginFO("long123@gmail.com", "123123"));
//        }
    }

}
