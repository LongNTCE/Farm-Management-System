/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.FacilityBreed_Table;
import entity.FacilityHarvest_Record;
import entity.FacilityHarvest_Table;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class FacilityHarvestDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<FacilityHarvest_Table> getFHarvestByCID(int cropID) {
        List<FacilityHarvest_Table> fHarvestRecordList = new ArrayList<>();
        String query = "SELECT * FROM `facility_harvest_table` WHERE cropID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cropID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                fHarvestRecordList.add(new FacilityHarvest_Table(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3)
                ));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return fHarvestRecordList;
    }

    public List<FacilityHarvest_Record> getFHarvestDetailByTable(int fHarvestTID) {
        List<FacilityHarvest_Record> fHarvestDetailList = new ArrayList<>();
        String query = "SELECT * FROM `facility_harvest_record` WHERE fHarvestTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fHarvestTID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                fHarvestDetailList.add(new FacilityHarvest_Record(
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
        return fHarvestDetailList;
    }

    public void addHarvestTable(int cropID, String fHarvestTName) {
        String query = "INSERT INTO `facility_harvest_table`( `cropID`, `fHarvestTName`) VALUES (?, ?);";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cropID);
            ps.setString(2, fHarvestTName);
            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public void editFacilityHarvestTable(int fHarvestTID, String fHarvestTName) {
        String query = "UPDATE `facility_harvest_table` SET `fHarvestTName` = ? WHERE `facility_harvest_table`.`fHarvestTID` = ?";

        //UPDATE `facility` SET `fName` = 'edit2', `fAddress` = 'addedit3', `fPhone` = '000000003', `fCultivatingPondSquare` = '4', `fStoragePondSquare` = '6', `fWastePondSquare` = '7', `fCultivatingObject` = 'cu', `fCultivatingTime` = '151', `fTotalSquare` = '151' WHERE `facility`.`facilityID` = 1
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);

            ps.setInt(2, fHarvestTID);
            ps.setString(1, fHarvestTName);

            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public FacilityHarvest_Table getHarvestTableByFTID(int fTableID) {
        //     List<FacilityBreed_Table> breedList = new ArrayList<>();
        String query = "SELECT * FROM `facility_harvest_table` WHERE fHarvestTID  = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fTableID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new FacilityHarvest_Table(
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

    public void deleteHarvestRecord(int cc) {
        String query = "DELETE FROM `facility_harvest_record` WHERE fHarvestID = ?";
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

    public void deleteFHarvestRecordIDbyTID(int fHarvestTID) {
        String query1 = "DELETE FROM facility_harvest_record WHERE fHarvestTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query1);
            ps.setInt(1, fHarvestTID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong " + fHarvestTID);
        } catch (Exception e) {
            System.out.println(e);
        }

//        return list;
    }

    public void deleteHarvestTable(int cc) {
        deleteFHarvestRecordIDbyTID(cc);
        String query = "DELETE FROM `facility_harvest_table` WHERE fHarvestTID = ?";
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

    public void deleteHarvestTableByCID(int cc) {

        List<FacilityHarvest_Table> listFHT = getFHarvestByCID(cc);

        for (FacilityHarvest_Table f : listFHT) {
            deleteFHarvestRecordIDbyTID(f.getfHarvestTID());
        }

        String query = "DELETE FROM `facility_harvest_table` WHERE cropID = ?";
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

    public void addHarvestRecord(int pondID, int fHarvestTID, String harvestDate, double harvestNetWeight, double harvestWeight, String merchantNameAddress) {
        String query = "INSERT INTO `facility_harvest_record`( `pondID`, `fHarvestTID`, `harvestDate`, `harvestNetWeight`, `harvestWeight`, `merchantNameAddress`) VALUES ( ?, ?, ?, ?, ?, ?);";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            ps.setInt(2, fHarvestTID);
            ps.setString(3, harvestDate);
            ps.setDouble(4, harvestNetWeight);
            ps.setDouble(5, harvestWeight);
            ps.setString(6, merchantNameAddress);

            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public void editFacilityHarvestRecord(int fHarvestID, int pondID, String harvestDate, double harvestNetWeight, double harvestWeight, String mechantNameAddress) {
        String query = "UPDATE `facility_harvest_record` SET `pondID` = ?,`harvestDate` = ?,`harvestNetWeight` = ?,`harvestWeight` = ?,`merchantNameAddress` = ? WHERE `facility_harvest_record`.`fHarvestID` = ?";
        //UPDATE `facility` SET `fName` = 'edit2', `fAddress` = 'addedit3', `fPhone` = '000000003', `fCultivatingPondSquare` = '4', `fStoragePondSquare` = '6', `fWastePondSquare` = '7', `fCultivatingObject` = 'cu', `fCultivatingTime` = '151', `fTotalSquare` = '151' WHERE `facility`.`facilityID` = 1
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            //  ps.setInt(1, fBreedTID);
            ps.setInt(1, pondID);
            ps.setString(2, harvestDate);
            ps.setDouble(3, harvestNetWeight);
            ps.setDouble(4, harvestWeight);
            ps.setString(5, mechantNameAddress);
            ps.setInt(6, fHarvestID);
            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public FacilityHarvest_Table getFHarvestTableDetail(int fHarvestTID) {
        String query = "SELECT * FROM `facility_harvest_table` WHERE fHarvestTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fHarvestTID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new FacilityHarvest_Table(
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

    public FacilityHarvest_Record getHarvestRecordDetail(int fHarvestID) {
        String query;
        query = "SELECT * FROM `facility_harvest_record` WHERE fHarvestID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fHarvestID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Login thanh cong");
                return new FacilityHarvest_Record(
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

    public String getPondNameByPID(int pondID) {
        String query = "SELECT `pondName` FROM `pond` WHERE pondID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
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

    public static void main(String[] args) {
        FacilityHarvestDAO dao = new FacilityHarvestDAO();

    }
}
