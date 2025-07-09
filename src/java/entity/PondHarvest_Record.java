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
public class PondHarvest_Record {
    private int pondHarvestID;
    private int pondID;
    private Date harvestDate;
    private double harvestNetWeight;
    private double harvestWeight;
    private String merchantNameAddress;

    public PondHarvest_Record(int pondHarvestID, int pondID, Date harvestDate, double harvestNetWeight, double harvestWeight, String merchantNameAddress) {
        this.pondHarvestID = pondHarvestID;
        this.pondID = pondID;
        this.harvestDate = harvestDate;
        this.harvestNetWeight = harvestNetWeight;
        this.harvestWeight = harvestWeight;
        this.merchantNameAddress = merchantNameAddress;
    }

    public int getPondHarvestID() {
        return pondHarvestID;
    }

    public void setPondHarvestID(int pondHarvestID) {
        this.pondHarvestID = pondHarvestID;
    }

    public int getPondID() {
        return pondID;
    }

    public void setPondID(int pondID) {
        this.pondID = pondID;
    }

    public Date getHarvestDate() {
        return harvestDate;
    }

    public void setHarvestDate(Date harvestDate) {
        this.harvestDate = harvestDate;
    }

    public double getHarvestNetWeight() {
        return harvestNetWeight;
    }

    public void setHarvestNetWeight(double harvestNetWeight) {
        this.harvestNetWeight = harvestNetWeight;
    }

    public double getHarvestWeight() {
        return harvestWeight;
    }

    public void setHarvestWeight(double harvestWeight) {
        this.harvestWeight = harvestWeight;
    }

    public String getMerchantNameAddress() {
        return merchantNameAddress;
    }

    public void setMerchantNameAddress(String merchantNameAddress) {
        this.merchantNameAddress = merchantNameAddress;
    }
    
    
}
