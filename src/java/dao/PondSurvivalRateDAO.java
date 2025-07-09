/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.PondSurvivalRate_Record;
import entity.PondSurvivalRate_Table;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PondSurvivalRateDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<PondSurvivalRate_Table> getPSurvivalRateByPID(int pondID) {
        List<PondSurvivalRate_Table> pSurvivalRateList = new ArrayList<>();
        String query = "SELECT * FROM `pond_survivalrate_table` WHERE pondID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                pSurvivalRateList.add(new PondSurvivalRate_Table(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3)
                ));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pSurvivalRateList;
    }

    public List<PondSurvivalRate_Record> getPSurvivalRateDetailByTable(int pondSurvivalRateTID) {
        List<PondSurvivalRate_Record> fSurvivalRateDetailList = new ArrayList<>();
        String query = "SELECT * FROM `pond_survivalrate_record` WHERE pondSurvivalRateTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondSurvivalRateTID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                fSurvivalRateDetailList.add(new PondSurvivalRate_Record(
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
        return fSurvivalRateDetailList;
    }

    public void addPSurvivalRateTable(int pondID, String pondSurvivalRateTName) {
        String query = "INSERT INTO pond_survivalrate_table( `pondID`, `pondSurvivalRateTName`) VALUES (?, ?)";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondID);
            ps.setString(2, pondSurvivalRateTName);

            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }

    }

    public void editPondSurvivalRateTable(int pondSurvivalRateTID, String pondSurvivalRateTName) {
        String query = "UPDATE pond_survivalrate_table SET pondSurvivalRateTName = ? WHERE  pond_survivalrate_table.pondSurvivalRateTID  = ?";

        //UPDATE `facility` SET `fName` = 'edit2', `fAddress` = 'addedit3', `fPhone` = '000000003', `fCultivatingPondSquare` = '4', `fStoragePondSquare` = '6', `fWastePondSquare` = '7', `fCultivatingObject` = 'cu', `fCultivatingTime` = '151', `fTotalSquare` = '151' WHERE `facility`.`facilityID` = 1
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);

            ps.setInt(2, pondSurvivalRateTID);
            ps.setString(1, pondSurvivalRateTName);

            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }

    }

    public void deletePSurvivalRateTable(int pondSurvivalRateTID) {
        String query = "DELETE FROM `pond_survivalrate_table` WHERE pondSurvivalRateTID = ?";

        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondSurvivalRateTID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public PondSurvivalRate_Table getSurvivalRateTableByTID(int survivalTID) {
        String query = "SELECT * FROM pond_survivalrate_table WHERE pondSurvivalRateTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, survivalTID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new PondSurvivalRate_Table(
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
        String query = "DELETE FROM `pond_survivalrate_record` WHERE pondSurvivalRateID = ?";

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

    public void addSurvivalRecord(int pondSurvivalRateTID, String survivalDate, Double survivalMediumWeight, int deathNumber, int lossNumber, Double diseaseNumber, String diseaseSign, Double estimateSurvivalRate) {
        String query = "INSERT INTO `pond_survivalrate_record`( `pondSurvivalRateTID`, `survivalDate`, `survivalMediumWeight`, `deathNumber`, `lossNumber`, `diseaseNumber`, `diseaseSign`, `estimateSurvivalRate`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondSurvivalRateTID);
            ps.setString(2, survivalDate);
            ps.setDouble(3, survivalMediumWeight);
            ps.setInt(4, deathNumber);
            ps.setInt(5, lossNumber);
            ps.setDouble(6, diseaseNumber);
            ps.setString(7, diseaseSign);
            ps.setDouble(8, estimateSurvivalRate);

            System.out.println("Add Pond Thanh Cong");
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }

    }

    public void editSurvivalRateRecord(int pondSurvivalRateID, String survivalDate, Double survivalMediumWeight, int deathNumber, int lossNumber, Double diseaseNumber, String diseaseSign, Double estimateSurvivalRate) {
        String query = "UPDATE `pond_survivalrate_record` SET  `survivalDate` = ?, `survivalMediumWeight` = ?, `deathNumber` = ?, `lossNumber` = ?, `diseaseNumber` = ?, `diseaseSign` = ?, `estimateSurvivalRate` = ? WHERE `pond_survivalrate_record`.`pondSurvivalRateID` = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);

            ps.setString(1, survivalDate);
            ps.setDouble(2, survivalMediumWeight);
            ps.setInt(3, deathNumber);
            ps.setInt(4, lossNumber);
            ps.setDouble(5, diseaseNumber);
            ps.setString(6, diseaseSign);
            ps.setDouble(7, estimateSurvivalRate);
            ps.setInt(8, pondSurvivalRateID);
            ps.executeUpdate();
            System.out.println("Edit Thanh cong");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Pond Fail CMNR");
        }
    }

    public void deleteSurvivalRateRecordIDbyTID(int pondSurvivalRateTID) {
        String query1 = "DELETE FROM `pond_survivalrate_record` WHERE pondSurvivalRateTID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query1);
            ps.setInt(1, pondSurvivalRateTID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong " + pondSurvivalRateTID);
        } catch (Exception e) {
            System.out.println(e);
        }

//        return list;
    }

    public void deleteSurvivalRateTable(int cc) {
        deleteSurvivalRateRecordIDbyTID(cc);
        String query = "DELETE FROM `pond_survivalrate_table` WHERE pondSurvivalRateTID= ?";
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

    public void deleteSurvivalRateTableByPID(int cc) {

        List<PondSurvivalRate_Table> listPSRT = getPSurvivalRateByPID(cc);

        for (PondSurvivalRate_Table p : listPSRT) {
            deleteSurvivalRateRecordIDbyTID(p.getPondSurvivalRateTID());
        }

        String query = "DELETE FROM `pond_survivalrate_table` WHERE pondID= ?";
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

    public PondSurvivalRate_Table getSurvivalRateTableDetail(int pondSurvivalRateTID) {
        String query = "SELECT * FROM `pond_survivalrate_table` WHERE pondSurvivalRateTID =?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondSurvivalRateTID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new PondSurvivalRate_Table(
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

    public PondSurvivalRate_Record getSurvivalRateRecordDetail(int pondSurvivalRateID) {
        String query = "SELECT * FROM `pond_survivalrate_record` WHERE pondSurvivalRateID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, pondSurvivalRateID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new PondSurvivalRate_Record(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getDate(3),
                        rs.getDouble(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getDouble(7),
                        rs.getString(8),
                        rs.getDouble(9));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }

    public static void main(String[] args) {
        PondSurvivalRateDAO pSurvivalRateDao = new PondSurvivalRateDAO();
        pSurvivalRateDao.editSurvivalRateRecord(2, "2022-09-01", 3.0, 0, 2, 3.0, "Nhap giao vien", 33.0);
//        pSurvivalRateDao.addSurvivalRecord(3, "2022-09-01", 3.0, 0, 0, 2.0, "It noi, met moi", 234.0);
    }
}
