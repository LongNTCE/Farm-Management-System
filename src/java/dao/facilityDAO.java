/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Crop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Admin
 */
public class facilityDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void deleteFacility(int facilityID) {
        cropDAO cropDAO = new cropDAO();
        List<Crop> listC = cropDAO.getCropByFacilityID(facilityID);
        FacilityEmployeeDAO feDAO = new FacilityEmployeeDAO();

        feDAO.deleteFacilityEmployeeByFID(facilityID);

        for (Crop c : listC) {
            cropDAO.deleteCrop(c.getCropID());
        }

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
}
