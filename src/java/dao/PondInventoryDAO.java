/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.FacilityInventory_Record;
import entity.PondInventory_Record;
import entity.PondInventory_Table;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PondInventoryDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public String getPNameByfaIID(int faInventoryID) {
        String query = "SELECT `productName` FROM `facility_inventory_record` WHERE faInventoryID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, faInventoryID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return rs.getString(1);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<FacilityInventory_Record> getAllFIR(int cropID) {
        List<Integer> fInventoryList = new ArrayList<>();
        List<FacilityInventory_Record> fInventoryRList = new ArrayList<>();
        String query = "SELECT fInventoryTID FROM `facility_inventory_table` WHERE cropID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cropID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                fInventoryList.add(rs.getInt(1));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        for (Integer i : fInventoryList) {
            String query1 = "SELECT * FROM `facility_inventory_record` WHERE fInventoryTID = ?";
            try {
                conn = DBContext.getConnection();       // call function form DBconnection
                ps = conn.prepareStatement(query1);
                ps.setInt(1, i);
                rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println("Lay du lieu thanh cong");
                    fInventoryRList.add(new FacilityInventory_Record(
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
        }
//        System.out.println("tao"+fInventoryRList);
        return fInventoryRList;
    }

    public List<PondInventory_Table> getPInventoryByPID(int pondID) {
        List<PondInventory_Table> pInventoryList = new ArrayList<>();
        String query = "SELECT * FROM `pond_inventory_table` WHERE pondID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                pInventoryList.add(new PondInventory_Table(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3)
                ));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pInventoryList;
    }

    public List<PondInventory_Record> getPInventoryDetailByTable(int pondInventoryTID) {
        List<PondInventory_Record> fSurvivalRateDetailList = new ArrayList<>();
        String query = "SELECT * FROM `pond_inventory_record` WHERE pondInventoryTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondInventoryTID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                fSurvivalRateDetailList.add(new PondInventory_Record(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getDate(4),
                        rs.getDouble(5),
                        rs.getDouble(6),
                        rs.getString(7)
                ));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return fSurvivalRateDetailList;
    }

    public void addPInventoryTable(int pondID, String pondInventoryTName) {
        String query = "INSERT INTO `pond_inventory_table`( `pondID`, `pondInventoryTName`) VALUES (?, ?)";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            ps.setString(2, pondInventoryTName);

            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }

    }

    public void addPInventoryR(int pondInventoryTID, int faInventoryID, String usageDate, double dosage, double usageWeight, String usagePurpose) {
        String query = "INSERT INTO `pond_inventory_record` (`pondInventoryID`, `pondInventoryTID`, `faInventoryID`, `usageDate`, `dosage`, `usageWeight`, `usagePurpose`) VALUES (NULL, ?, ?, ?, ?, ?, ?);";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondInventoryTID);
            ps.setInt(2, faInventoryID);
            ps.setString(3, usageDate);
            ps.setDouble(4, dosage);
            ps.setDouble(5, usageWeight);
            ps.setString(6, usagePurpose);

            System.out.println("Add cc Thanh Cong");
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add cc Fail CMNR");
        }

    }

    public void editPondInventoryTable(int pondInventoryTID, String pondInventoryTName) {
        String query = "UPDATE pond_inventory_table SET pondInventoryTName = ? WHERE  pond_inventory_table.pondInventoryTID  = ?";

        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);

            ps.setInt(2, pondInventoryTID);
            ps.setString(1, pondInventoryTName);

            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }

    }

    public void edPondInventoryRecord(int pondInventoryID, String usageDate, Double dosage, Double usageWeight, String usagePurpose) {
        String query = "UPDATE `pond_inventory_record` SET `usageDate` = ?, `dosage` = ?, `usageWeight` = ?, `usagePurpose` = ? WHERE `pond_inventory_record`.`pondInventoryID` = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);

            ps.setString(1, usageDate);
            ps.setDouble(2, dosage);
            ps.setDouble(3, usageWeight);
            ps.setString(4, usagePurpose);
            ps.setInt(5, pondInventoryID);
            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public void deletePInventoryRecord(int cc) {
        String query = "DELETE FROM `pond_inventory_record` WHERE pondInventoryID = ?";

        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cc);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void deletePondInventoryRecordByTID(int pondInventoryTID) {
        String query1 = "DELETE FROM `pond_inventory_record` WHERE pondInventoryTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query1);
            ps.setInt(1, pondInventoryTID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong " + pondInventoryTID);
        } catch (Exception e) {
            System.out.println(e);
        }

//        return list;
    }

    public void deletePondInventoryTable(int cc) {
        deletePondInventoryRecordByTID(cc);
        String query = "DELETE FROM `pond_inventory_table` WHERE pondInventoryTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cc);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deletePondInventoryTableByPID(int cc) {

        List<PondInventory_Table> listPIT = getPInventoryByPID(cc);

        for (PondInventory_Table p : listPIT) {
            deletePondInventoryRecordByTID(p.getPondInventoryTID());
        }

        String query = "DELETE FROM `pond_inventory_table` WHERE pondID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cc);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public PondInventory_Table getPondInventoryTableDetail(int pondInventoryTID) {
        String query = "SELECT * FROM `pond_inventory_table` WHERE pondInventoryTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondInventoryTID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new PondInventory_Table(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3)
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public PondInventory_Record getPondInventoryRecordDetail(int pondInventoryID) {
        String query = "SELECT * FROM `pond_inventory_record` WHERE pondInventoryID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondInventoryID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new PondInventory_Record(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getDate(4),
                        rs.getDouble(5),
                        rs.getDouble(6),
                        rs.getString(7)
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }

    public static void main(String[] args) {
        PondInventoryDAO pInventoryDAO = new PondInventoryDAO();
        //  pInventoryDAO.deletePInventoryRecord(26);
        pInventoryDAO.getPondInventoryTableDetail(3);
        System.out.println(pInventoryDAO.getPondInventoryRecordDetail(33));
    }
}
