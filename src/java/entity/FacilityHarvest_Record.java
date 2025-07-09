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
public class FacilityHarvest_Record {

    private int fHarvestID;
    private int pondID;
    private int fHarvestTID;
    private Date harvestDate;
    private double harvestNetWeight;
    private double harvestWeight;
    private String merchantNameAddress;
    private String pondName;

    public String getPondName() {
        return pondName;
    }

    public void setPondName(String pondName) {
        this.pondName = pondName;
    }

    public FacilityHarvest_Record(int fHarvestID, int pondID, int fHarvestTID, Date harvestDate, double harvestNetWeight, double harvestWeight, String merchantNameAddress, String pondName) {
        this.fHarvestID = fHarvestID;
        this.pondID = pondID;
        this.fHarvestTID = fHarvestTID;
        this.harvestDate = harvestDate;
        this.harvestNetWeight = harvestNetWeight;
        this.harvestWeight = harvestWeight;
        this.merchantNameAddress = merchantNameAddress;
        this.pondName = pondName;
    }

    public FacilityHarvest_Record(int fHarvestID, int pondID, int fHarvestTID, Date harvestDate, double harvestNetWeight, double harvestWeight, String merchantNameAddress) {
        this.fHarvestID = fHarvestID;
        this.pondID = pondID;
        this.fHarvestTID = fHarvestTID;
        this.harvestDate = harvestDate;
        this.harvestNetWeight = harvestNetWeight;
        this.harvestWeight = harvestWeight;
        this.merchantNameAddress = merchantNameAddress;

    }

    public FacilityHarvest_Record(int aInt, int aInt0, int aInt1, Date date, double aDouble, double aDouble0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getfHarvestID() {
        return fHarvestID;
    }

    public void setfHarvestID(int fHarvestID) {
        this.fHarvestID = fHarvestID;
    }

    public int getPondID() {
        return pondID;
    }

    public void setPondID(int pondID) {
        this.pondID = pondID;
    }

    public int getfHarvestTID() {
        return fHarvestTID;
    }

    public void setfHarvestTID(int fHarvestTID) {
        this.fHarvestTID = fHarvestTID;
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
