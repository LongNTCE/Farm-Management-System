/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.PondWaterEnv_Record;
import entity.PondWaterEnvironment_Record;
import entity.PondWaterEnvironment_Table;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PondWaterEnvDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<PondWaterEnvironment_Table> getPWaterEnvByPID(int pondID) {
        List<PondWaterEnvironment_Table> pWaterEnvList = new ArrayList<>();
        String query = "SELECT * FROM `pond_waterenv_table` WHERE pondID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                pWaterEnvList.add(new PondWaterEnvironment_Table(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3)
                ));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pWaterEnvList;
    }

    public List<PondWaterEnv_Record> getPWaterEnvDetail(int pondWaterEnvTID) {
        List<PondWaterEnv_Record> pWaterEnvDetailList = new ArrayList<>();
        String query = "SELECT * FROM `pond_waterenvironment_record` WHERE pondWaterEnvTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondWaterEnvTID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                pWaterEnvDetailList.add(new PondWaterEnv_Record(
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
        return pWaterEnvDetailList;
    }

    public void addWaterEnvRep(int pondID, String pondEnvTName) {
        String query = "INSERT INTO `pond_waterenv_table`( `pondID`, `pondEnvTName`) VALUES (?, ?);";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            ps.setString(2, pondEnvTName);
            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public void addPWaterEnvTable(int pondID, String pondEnvTName) {
        String query = "INSERT INTO `pond_waterenv_table`(`pondID`, `pondEnvTName`) VALUES (?,?)";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            ps.setString(2, pondEnvTName);
            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public void editPondWaterEnvTable(int pondWaterEnvTID, String pondEnvTName) {
        String query = "UPDATE pond_waterenv_table SET pondEnvTName = ? WHERE  pond_waterenv_table.pondWaterEnvTID  = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(2, pondWaterEnvTID);
            ps.setString(1, pondEnvTName);
            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public PondWaterEnvironment_Table getWaterEnvTableByTID(int waterEnvTID) {
        String query = "SELECT * FROM `pond_waterenv_table` WHERE pondWaterEnvTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, waterEnvTID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new PondWaterEnvironment_Table(
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

    public void deleteSurvivalRateRecord(int ccc) {
        String query = "DELETE FROM `pond_waterenvironment_record` WHERE pondEnvID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, ccc);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addWaterEnvRecord(int pondWaterEnvTID, String envDate, Double dissolveOxygen_morning, Double dissolveOxygen_afternoon, Double pH_morning, Double pH_afternoon, Double temperature_morning, Double temperature_afternoon, Double salinity, Double purity, Double NH3, Double alkali, Double H2S) {
        String query = "INSERT INTO `pond_waterenvironment_record`(`pondWaterEnvTID`, `envDate`, `dissolveOxygen_morning`, `dissolveOxygen_afternoon`, `pH_morning`, `pH_afternoon`, `temperature_morning`, `temperature_afternoon`, `salinity`, `purity`, `NH3`, `alkali`, `H2S`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondWaterEnvTID);
            ps.setString(2, envDate);
            ps.setDouble(3, dissolveOxygen_morning);
            ps.setDouble(4, dissolveOxygen_afternoon);
            ps.setDouble(5, pH_morning);
            ps.setDouble(6, pH_afternoon);
            ps.setDouble(7, temperature_morning);
            ps.setDouble(8, temperature_afternoon);
            ps.setDouble(9, salinity);
            ps.setDouble(10, purity);
            ps.setDouble(11, NH3);
            ps.setDouble(12, alkali);
            ps.setDouble(13, H2S);
            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public void editWaterEnvRecord(int pondEnvID, String envDate, Double dissolveOxygen_morning, Double dissolveOxygen_afternoon, Double pH_morning, Double pH_afternoon, Double temperature_morning, Double temperature_afternoon, Double salinity, Double purity, Double NH3, Double alkali, Double H2S) {
        String query = "UPDATE `pond_waterenvironment_record` SET `envDate` = ?, `dissolveOxygen_morning` = ?, `dissolveOxygen_afternoon` = ?, `pH_morning` = ?, `pH_afternoon` = ?, `temperature_morning` = ?, `temperature_afternoon` = ?, `salinity` = ? , `purity` = ?, `NH3` = ?, `alkali` = ?, `H2S` = ? WHERE `pond_waterenvironment_record`.`pondEnvID` = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, envDate);
            ps.setDouble(2, dissolveOxygen_morning);
            ps.setDouble(3, dissolveOxygen_afternoon);
            ps.setDouble(4, pH_morning);
            ps.setDouble(5, pH_afternoon);
            ps.setDouble(6, temperature_morning);
            ps.setDouble(7, temperature_afternoon);
            ps.setDouble(8, salinity);
            ps.setDouble(9, purity);
            ps.setDouble(10, NH3);
            ps.setDouble(11, alkali);
            ps.setDouble(12, H2S);
            ps.setInt(13, pondEnvID);
            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public void deleteWaterEnvRecordByTID(int pondWaterEnvTID) {
        String query1 = "DELETE FROM `pond_waterenvironment_record` WHERE pondWaterEnvTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query1);
            ps.setInt(1, pondWaterEnvTID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong " + pondWaterEnvTID);
        } catch (Exception e) {
            System.out.println(e);
        }
//        return list;
    }

    public void deletWaterEnvTable(int cc) {
        deleteWaterEnvRecordByTID(cc);
        String query = "DELETE FROM `pond_waterenv_table` WHERE pondWaterEnvTID = ?";
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

    public void deletWaterEnvTableByPID(int cc) {

        List<PondWaterEnvironment_Table> listPWET = getPWaterEnvByPID(cc);

        for (PondWaterEnvironment_Table p : listPWET) {
            deleteWaterEnvRecordByTID(p.getPondWaterEnvTID());
        }

        String query = "DELETE FROM `pond_waterenv_table` WHERE pondID = ?";
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

    public PondWaterEnvironment_Table getWaterEnvTableDetail(int pondWaterEnvTID) {
        String query = "SELECT * FROM `pond_waterenv_table` WHERE pondWaterEnvTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondWaterEnvTID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new PondWaterEnvironment_Table(
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

    public PondWaterEnv_Record getWaterEnvRecordDetail(int pondEnvID) {
        String query = "SELECT * FROM `pond_waterenvironment_record` WHERE pondEnvID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondEnvID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new PondWaterEnv_Record(
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
                        rs.getDouble(14));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static void main(String[] args) {
        PondWaterEnvDAO pWaterEnvDao = new PondWaterEnvDAO();
        System.out.println(pWaterEnvDao.getWaterEnvTableDetail(6));
    }
}
