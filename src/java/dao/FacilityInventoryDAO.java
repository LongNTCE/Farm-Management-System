/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.FacilityInventory_Record;
import entity.FacilityInventory_Table;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class FacilityInventoryDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<FacilityInventory_Table> getFInventoryByCID(int cropID) {
        List<FacilityInventory_Table> fInventoryRecordList = new ArrayList<>();
        String query = "SELECT * FROM `facility_inventory_table` WHERE cropID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cropID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                fInventoryRecordList.add(new FacilityInventory_Table(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3)
                ));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return fInventoryRecordList;
    }

    public List<FacilityInventory_Record> getFInventoryDetailByTable(int fInventoryTID) {
        List<FacilityInventory_Record> fInventoryDetailList = new ArrayList<>();
        String query = "SELECT * FROM `facility_inventory_record` WHERE fInventoryTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fInventoryTID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                fInventoryDetailList.add(new FacilityInventory_Record(
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
        return fInventoryDetailList;
    }

    public void addInventoryTable(int cropID, String fInventoryTName) {
        String query = "INSERT INTO `facility_inventory_table`( `cropID`, `fInventoryTName`) VALUES (?, ?);";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cropID);
            ps.setString(2, fInventoryTName);
            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public void editFacilityInventoryTable(int fInventoryTID, String fInventoryTName) {
        String query = "UPDATE `facility_inventory_table` SET `fInventoryTName` = ? WHERE `facility_inventory_table`.`fInventoryTID` = ?";
        //UPDATE `facility` SET `fName` = 'edit2', `fAddress` = 'addedit3', `fPhone` = '000000003', `fCultivatingPondSquare` = '4', `fStoragePondSquare` = '6', `fWastePondSquare` = '7', `fCultivatingObject` = 'cu', `fCultivatingTime` = '151', `fTotalSquare` = '151' WHERE `facility`.`facilityID` = 1
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(2, fInventoryTID);
            ps.setString(1, fInventoryTName);
            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public FacilityInventory_Table getInventoryTableByFTID(int fTableID) {
        //     List<FacilityBreed_Table> breedList = new ArrayList<>();
        String query = "SELECT * FROM `facility_inventory_table` WHERE fInventoryTID  = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fTableID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new FacilityInventory_Table(
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

    public void addInventoryRecord(int fInventoryTID, String productName, String importDate, int quantity, String sourceName, String manurfacturingDate, String expireDate) {
        String query = "INSERT INTO `facility_inventory_record`( `fInventoryTID`, `productName`, `importDate`, `quantity`, `sourceName`, `manurfacturingDate`,`expireDate`) VALUES ( ?, ?, ?, ?, ?, ?, ?);";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fInventoryTID);
            ps.setString(2, productName);
            ps.setString(3, importDate);
            ps.setInt(4, quantity);
            ps.setString(5, sourceName);
            ps.setString(6, manurfacturingDate);
            ps.setString(7, expireDate);
            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public void deleteInventoryRecord(int cc) {
        String query = "DELETE FROM `facility_inventory_record` WHERE faInventoryID = ?";
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

    public void deletePondInventoryRecordIDbyFIRID(int fTableID) {
        List<Integer> list = new ArrayList<>();
        String query = "SELECT pondInventoryID FROM `pond_inventory_record` WHERE faInventoryID  = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fTableID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                list.add(rs.getInt(1));
            }
//            return list;
        } catch (Exception e) {
            System.out.println(e);
        }

        for (Integer i : list) {
            String query1 = "DELETE FROM `pond_inventory_record` WHERE pondInventoryID = ?";
            try {
                conn = DBContext.getConnection();       // call function form DBconnection
                ps = conn.prepareStatement(query1);
                ps.setInt(1, i);
                ps.executeUpdate();
                System.out.println("Delete Thanh cong " + i);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

//        return list;
    }

    public void deleteFacilityInventoryRecordIDbyFITID(int fTableID) {
        List<Integer> list = new ArrayList<>();
        String query = "SELECT faInventoryID FROM `facility_inventory_record` WHERE fInventoryTID  = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fTableID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                list.add(rs.getInt(1));
            }
//            return list;
        } catch (Exception e) {
            System.out.println(e);
        }

        for (Integer i : list) {
            deletePondInventoryRecordIDbyFIRID(i);
        }
        for (Integer i : list) {
            String query1 = "DELETE FROM `facility_inventory_record` WHERE faInventoryID = ?";
            try {
                conn = DBContext.getConnection();       // call function form DBconnection
                ps = conn.prepareStatement(query1);
                ps.setInt(1, i);
                ps.executeUpdate();
                System.out.println("Delete Thanh cong " + i);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
//        return list;
    }

    public void deleteFacilityInventoryTable(int cc) {
        deleteFacilityInventoryRecordIDbyFITID(cc);

        String query = "DELETE FROM `facility_inventory_table` WHERE fInventoryTID = ?";
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

    public void deleteFacilityInventoryTableByCID(int cc) {

        List<FacilityInventory_Table> listFIT = getFInventoryByCID(cc);

        for (FacilityInventory_Table f : listFIT) {
            deleteFacilityInventoryRecordIDbyFITID(f.getfInventoryTID());
        }
        String query = "DELETE FROM `facility_inventory_table` WHERE cropID = ?";
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

    public void editFacilityInvetoryRecord(int faInventoryID, String productName, String importDate, int quantity, String sourceName, String manurfacturingDate, String expireDate) {
        String query = "UPDATE `facility_inventory_record` SET `productName` = ?,`importDate` = ?,`quantity` = ?,`sourceName` = ?,`manurfacturingDate` = ?,`expireDate` = ? WHERE `facility_inventory_record`.`faInventoryID` = ?";
        //UPDATE `facility` SET `fName` = 'edit2', `fAddress` = 'addedit3', `fPhone` = '000000003', `fCultivatingPondSquare` = '4', `fStoragePondSquare` = '6', `fWastePondSquare` = '7', `fCultivatingObject` = 'cu', `fCultivatingTime` = '151', `fTotalSquare` = '151' WHERE `facility`.`facilityID` = 1
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            //  ps.setInt(1, fBreedTID);
            ps.setString(1, productName);
            ps.setString(2, importDate);
            ps.setInt(3, quantity);
            ps.setString(4, sourceName);
            ps.setString(5, manurfacturingDate);
            ps.setString(6, expireDate);
            ps.setInt(7, faInventoryID);
            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public FacilityInventory_Table getFInventoryTableDetail(int fInventoryTID) {
        String query = "SELECT * FROM `facility_inventory_table` WHERE fInventoryTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fInventoryTID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new FacilityInventory_Table(
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

    public FacilityInventory_Record getInventoryRecordDetail(int faInventoryID) {
        String query;
        query = "SELECT * FROM `facility_inventory_record` WHERE faInventoryID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, faInventoryID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Login thanh cong");
                return new FacilityInventory_Record(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getDate(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getDate(7),
                        rs.getDate(8));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static void main(String[] args) {
        FacilityInventoryDAO fInventoryDAO = new FacilityInventoryDAO();
//        System.out.println(fInventoryDAO.getPondInventoryRecordIDbyFIRID(fInventoryDAO.getFacilityInventoryRecordIDbyFITID(3).get(2)).get(0));
        fInventoryDAO.deleteFacilityInventoryTable(1);
    }
}
