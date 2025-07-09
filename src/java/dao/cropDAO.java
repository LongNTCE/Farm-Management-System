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
import entity.Pond;
import java.sql.Connection;
import java.sql.Date;
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
public class cropDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Crop getCropByCID(int cropID) {
        String query = "SELECT * FROM `crop` WHERE cropID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cropID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                return new Crop(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getDate(4),
                        rs.getDate(5)
                );

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Crop> getCropByFacilityID(int facilityID) {
        List<Crop> cropList = new ArrayList<>();
        String query = "SELECT * FROM `crop` WHERE facilityID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, facilityID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Lay du lieu thanh cong");
                cropList.add(new Crop(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getDate(4),
                        rs.getDate(5)));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return cropList;
    }

    public void addCropToFarm(int farmID, String cropName, Date cropStartDate, Date cropEndDate) {
        String query = "INSERT INTO crop`( farmID, cropName, cropStartDate, cropEndDate) VALUES (?,?,?,?)";

        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);

            ps.setInt(1, farmID);
            ps.setString(2, cropName);
            ps.setDate(3, cropStartDate);
            ps.setDate(4, cropEndDate);
            System.out.println("Add Crop Thanh Cong");
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Add Crop Fail CMNR");
        }

    }

    public void deleteCrop(int cropID) {
        pondDAO pondDAO = new pondDAO();
        List<Pond> listP = pondDAO.getPondByCropID(cropID);

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(pondDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Pond p : listP) {
            pondDAO.deletePond(p.getPondID());
        }

        FacilityBreedDAO fbDAO = new FacilityBreedDAO();
        FacilityHarvestDAO fhDAO = new FacilityHarvestDAO();
        FacilityInventoryDAO fiDAO = new FacilityInventoryDAO();

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(pondDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        fbDAO.deleteBreedTableByCID(cropID);

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(pondDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        fhDAO.deleteHarvestTableByCID(cropID);

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(pondDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        fiDAO.deleteFacilityInventoryTableByCID(cropID);

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(pondDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query1 = "DELETE FROM `crop_employee_authorization` WHERE cropID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query1);
            ps.setInt(1, cropID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong");

        } catch (Exception e) {
            System.out.println("Delete Fail");
        }

        String query = "DELETE FROM `crop` WHERE cropID = ?";
        try {
            conn = DBContext.getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setInt(1, cropID);
            ps.executeUpdate();
            System.out.println("Delete Thanh cong");
        } catch (Exception e) {
            System.out.println("Delete Fail");
        }
    }

    public static void main(String[] args) {
        cropDAO cropDao = new cropDAO();
        cropDao.getCropByCID(5);

    }

}
