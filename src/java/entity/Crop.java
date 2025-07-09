/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Crop {
    private int cropID;
    private int farmID;
    private String cropName;
    private Date cropStartDate;
    private Date cropEndDate;

    public Crop(int cropID){
        this.cropID = cropID;
    }
    public Crop(int cropID, int farmID, String cropName, Date cropStartDate, Date cropEndDate) {
        this.cropID = cropID;
        this.farmID = farmID;
        this.cropName = cropName;
        this.cropStartDate = cropStartDate;
        this.cropEndDate = cropEndDate;
    }

    public int getCropID() {
        return cropID;
    }

    public void setCropID(int cropID) {
        this.cropID = cropID;
    }

    public int getFarmID() {
        return farmID;
    }

    public void setFarmID(int farmID) {
        this.farmID = farmID;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public Date getCropStartDate() {
        return cropStartDate;
    }

    public void setCropStartDate(Date cropStartDate) {
        this.cropStartDate = cropStartDate;
    }

    public Date getCropEndDate() {
        return cropEndDate;
    }

    public void setCropEndDate(Date cropEndDate) {
        this.cropEndDate = cropEndDate;
    }
    
    
}
