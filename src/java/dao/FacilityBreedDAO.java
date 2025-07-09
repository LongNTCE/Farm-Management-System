/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Crop;
import entity.FacilityBreed_Record;
import entity.FacilityBreed_Table;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class FacilityBreedDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<FacilityBreed_Table> getFBreedByCID(int cropID) {
        List<FacilityBreed_Table> fBreedRecordList = new ArrayList<>();
        String query = "SELECT * FROM `facility_breed_table` WHERE cropID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cropID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                fBreedRecordList.add(new FacilityBreed_Table(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3)
                ));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return fBreedRecordList;
    }

    public FacilityBreed_Table getbreedTableByFTID(int fTableID) {
        String query = "SELECT * FROM `facility_breed_table` WHERE fBreedTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fTableID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new FacilityBreed_Table(
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

    public void deleteBreedRecord(int cc) {
        String query = "DELETE FROM `facility_breed_record` WHERE fBreedID = ?";

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

    public List<FacilityBreed_Record> getFBreedDetailByTable(int fBreedTID) {
        List<FacilityBreed_Record> fBreedDetailList = new ArrayList<>();
        String query = "SELECT * FROM `facility_breed_record` WHERE fBreedTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fBreedTID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                fBreedDetailList.add(new FacilityBreed_Record(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getDate(4),
                        rs.getDouble(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8)));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return fBreedDetailList;
    }

    public void editFacilityBreedRecord(int fBreedID, int pondID, String breedDate, double breedSize, int breedDensity, String breedSourceName, String breedCertificateID) {
        String query = "UPDATE `facility_breed_record` SET `pondID` = ?,`breedDate` = ?,`breedSize` = ?,`breedDensity` = ?,`breedSourceName` = ?,`breedCertificateID` = ? WHERE `facility_breed_record`.`fBreedID` = ?";
        //UPDATE `facility` SET `fName` = 'edit2', `fAddress` = 'addedit3', `fPhone` = '000000003', `fCultivatingPondSquare` = '4', `fStoragePondSquare` = '6', `fWastePondSquare` = '7', `fCultivatingObject` = 'cu', `fCultivatingTime` = '151', `fTotalSquare` = '151' WHERE `facility`.`facilityID` = 1
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            //  ps.setInt(1, fBreedTID);
            ps.setInt(1, pondID);
            ps.setString(2, breedDate);
            ps.setDouble(3, breedSize);
            ps.setInt(4, breedDensity);
            ps.setString(5, breedSourceName);
            ps.setString(6, breedCertificateID);
            ps.setInt(7, fBreedID);
            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public void addBreedTable(int cropID, String fBreedTName) {
        String query = "INSERT INTO `facility_breed_table`( `cropID`, `fBreedTName`) VALUES (?, ?);";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cropID);
            ps.setString(2, fBreedTName);

            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }

    }

    public void addBreedRecord(int fBreedTID, int pondID, String breedDate, double breedSize, int breedDensity, String breedSourceName, String breedCertificateID) {
        String query = "INSERT INTO `facility_breed_record`( `fBreedTID`, `pondID`, `breedDate`, `breedSize`, `breedDensity`, `breedSourceName`, `breedCertificateID`) VALUES (?, ?, ?, ?, ?, ?, ?);";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fBreedTID);
            ps.setInt(2, pondID);
            ps.setString(3, breedDate);
            ps.setDouble(4, breedSize);
            ps.setInt(5, breedDensity);
            ps.setString(6, breedSourceName);
            ps.setString(7, breedCertificateID);

            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }

    }

    public void editFacilityBreedTable(int fBreedTID, String fBreedTName) {
        String query = "UPDATE `facility_breed_table` SET `fBreedTName` = ? WHERE `facility_breed_table`.`fBreedTID` = ?";

        //UPDATE `facility` SET `fName` = 'edit2', `fAddress` = 'addedit3', `fPhone` = '000000003', `fCultivatingPondSquare` = '4', `fStoragePondSquare` = '6', `fWastePondSquare` = '7', `fCultivatingObject` = 'cu', `fCultivatingTime` = '151', `fTotalSquare` = '151' WHERE `facility`.`facilityID` = 1
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);

            ps.setInt(2, fBreedTID);
            ps.setString(1, fBreedTName);

            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }

    }

    public void deleteFacilityBreedRecordTID(int fBreedTID) {
        String query1 = "DELETE FROM `facility_breed_record` WHERE fBreedTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query1);
            ps.setInt(1, fBreedTID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong " + fBreedTID);
        } catch (Exception e) {
            System.out.println(e);
        }

//        return list;
    }

    public void deleteBreedTable(int cc) {
        deleteFacilityBreedRecordTID(cc);

        String query = "DELETE FROM `facility_breed_table` WHERE fBreedTID = ?";
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

    public void deleteBreedTableByCID(int cc) {
        List<FacilityBreed_Table> listFBT = getFBreedByCID(cc);

        for (FacilityBreed_Table f : listFBT) {
            deleteFacilityBreedRecordTID(f.getfBreedTID());
        }

        String query = "DELETE FROM `facility_breed_table` WHERE cropID = ?";
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

    public FacilityBreed_Table getFBreedTableDetail(int fBreedTID) {
        String query = "SELECT * FROM `facility_breed_table` WHERE fBreedTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fBreedTID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new FacilityBreed_Table(
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

    public FacilityBreed_Record getBreedRecordDetail(int fBreedID) {
        String query;
        query = "SELECT * FROM `facility_breed_record` WHERE fBreedID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, fBreedID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new FacilityBreed_Record(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getDate(4),
                        rs.getDouble(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8)
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

    public void deleteAllFBreedRecord(int deleteAllFBreedRID) {
        deleteFacilityBreedRecordTID(deleteAllFBreedRID);

        String query = "DELETE FROM `facility_breed_record` WHERE fBreedTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, deleteAllFBreedRID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        FacilityBreedDAO dao = new FacilityBreedDAO();
        //   fBreedDao.getFBreedByCID(3);
        dao.deleteBreedTable(3);
    }
}
