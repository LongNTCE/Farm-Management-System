/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Crop;
import entity.Pond;
import entity.PondBreed_Record;
import entity.PondHarvest_Record;
import entity.PondSurvivalRate_Record;
import entity.PondWaterEnvironment_Record;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class pondDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void deletePond(int pondID) {
        PondInventoryDAO piDAO = new PondInventoryDAO();
        PondSurvivalRateDAO psrDAO = new PondSurvivalRateDAO();
        PondWaterEnvDAO pweDAO = new PondWaterEnvDAO();

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(pondDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        piDAO.deletePondInventoryTableByPID(pondID);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(pondDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        psrDAO.deleteSurvivalRateTableByPID(pondID);
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(pondDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        pweDAO.deletWaterEnvTableByPID(pondID);

        deletePondCropbyPID(pondID);
        String query1 = "DELETE FROM `pond_employee_authorization` WHERE pondID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query1);
            ps.setInt(1, pondID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong");

        } catch (Exception e) {
            System.out.println("Delete Fail");
        }

        String query = "DELETE FROM `pond` WHERE pondID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong");
        } catch (Exception e) {
            System.out.println("Delete Fail");
        }
    }

    public void deletePondCropbyPID(int pondID) {
        String query = "DELETE FROM `crop - pond` WHERE pondID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong");
        } catch (Exception e) {
            System.out.println("Delete Fail");
        }
    }

    public List<Pond> getPondByCropID(int cropID) {
        List<Pond> pondList = new ArrayList<>();
        String query = "SELECT * FROM `pond` INNER JOIN `crop - pond` ON `pond`.pondID = `crop - pond`.pondID where `crop - pond`.cropID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cropID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                pondList.add(new Pond(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4)
                ));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pondList;
    }

    public List<Pond> getPondByFID(int facilityiD) {
        List<Pond> pondListByFID = new ArrayList<>();
        String query = "SELECT * FROM `pond`  where facilityID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, facilityiD);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                pondListByFID.add(new Pond(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4)
                ));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pondListByFID;
    }

    public Pond getPondByPID(int pondID) {
        String query = "SELECT * FROM `pond` WHERE pondID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new Pond(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public double getPondSquareByPID(int pondID) {
        String query = "SELECT `pondSquare` FROM `pond` WHERE pondID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return rs.getDouble(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public List<PondHarvest_Record> getHarvestRecordByPondID(int pondID) {
        List<PondHarvest_Record> harvestRecordList = new ArrayList<>();
        String query = "SELECT * FROM pond_harvest_record WHERE pondID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                harvestRecordList.add(new PondHarvest_Record(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getDate(3),
                        rs.getDouble(4),
                        rs.getDouble(5),
                        rs.getString(6)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return harvestRecordList;
    }

    public List<PondSurvivalRate_Record> getSurvivalRateRecordByPondID(int pondID) {
        List<PondSurvivalRate_Record> pondSurvivalRateList = new ArrayList<>();
        String query = "SELECT * FROM `pond_survivalrate_record` WHERE pondID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                pondSurvivalRateList.add(new PondSurvivalRate_Record(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getDate(3),
                        rs.getDouble(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getDouble(7),
                        rs.getString(8),
                        rs.getDouble(9)
                ));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pondSurvivalRateList;
    }

    public List<PondWaterEnvironment_Record> getWaterEnvRecordByPondID(int pondID) {
        List<PondWaterEnvironment_Record> pondWaterEnvList = new ArrayList<>();
        String query = "SELECT * FROM `pond_waterenvironment_record` WHERE pondID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                pondWaterEnvList.add(new PondWaterEnvironment_Record(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getDate(3),
                        rs.getDouble(4),
                        rs.getDouble(5),
                        rs.getDouble(6),
                        rs.getDouble(7),
                        rs.getDouble(8),
                        rs.getDouble(9),
                        rs.getDouble(10),
                        rs.getDouble(11),
                        rs.getDouble(12),
                        rs.getDouble(13),
                        rs.getDouble(14)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pondWaterEnvList;
    }

    public List<PondBreed_Record> getPondBreedRecord(int pondID) {
        List<PondBreed_Record> pondBreedRecordList = new ArrayList<>();
        String query = "SELECT * FROM `pond_breed_record` WHERE pondID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                pondBreedRecordList.add(new PondBreed_Record(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getDate(3),
                        rs.getDouble(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pondBreedRecordList;
    }

    public void movePond(int cropID, int pondID) {
        String query = "UPDATE `crop - pond` SET `cropID` = ? WHERE `crop - pond`.`pondID` = ?";
        //UPDATE `facility` SET `fName` = 'edit2', `fAddress` = 'addedit3', `fPhone` = '000000003', `fCultivatingPondSquare` = '4', `fStoragePondSquare` = '6', `fWastePondSquare` = '7', `fCultivatingObject` = 'cu', `fCultivatingTime` = '151', `fTotalSquare` = '151' WHERE `facility`.`facilityID` = 1
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cropID);
            ps.setInt(2, pondID);
            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        pondDAO pondDao = new pondDAO();
        //  pondDao.getPondByFID(3);
        System.out.println(pondDao.getPondByCropID(9));
    }
}
