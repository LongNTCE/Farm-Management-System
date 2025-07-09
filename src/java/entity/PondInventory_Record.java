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
public class PondInventory_Record {
    private int pondInventoryID;
    private int pondInventoryTID;
    private int faInventoryID;
    private String productName;
    private Date usageDate;
    private double dosage;
    private double usageWeight;
    private String usagePurpose;

    public PondInventory_Record(int pondInventoryID, int pondInventoryTID, int faInventoryID, Date usageDate, double dosage, double usageWeight, String usagePurpose) {
        this.pondInventoryID = pondInventoryID;
        this.pondInventoryTID = pondInventoryTID;
        this.faInventoryID = faInventoryID;
        this.usageDate = usageDate;
        this.dosage = dosage;
        this.usageWeight = usageWeight;
        this.usagePurpose = usagePurpose;
    }

    public PondInventory_Record(int pondInventoryID, int pondInventoryTID, int faInventoryID, String productName, Date usageDate, double dosage, double usageWeight, String usagePurpose) {
        this.pondInventoryID = pondInventoryID;
        this.pondInventoryTID = pondInventoryTID;
        this.faInventoryID = faInventoryID;
        this.productName = productName;
        this.usageDate = usageDate;
        this.dosage = dosage;
        this.usageWeight = usageWeight;
        this.usagePurpose = usagePurpose;
    }

    public int getPondInventoryID() {
        return pondInventoryID;
    }

    public void setPondInventoryID(int pondInventoryID) {
        this.pondInventoryID = pondInventoryID;
    }

    public int getPondInventoryTID() {
        return pondInventoryTID;
    }

    public void setPondInventoryTID(int pondInventoryTID) {
        this.pondInventoryTID = pondInventoryTID;
    }

    public int getFaInventoryID() {
        return faInventoryID;
    }

    public void setFaInventoryID(int faInventoryID) {
        this.faInventoryID = faInventoryID;
    }

    public Date getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(Date usageDate) {
        this.usageDate = usageDate;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }

    public double getUsageWeight() {
        return usageWeight;
    }

    public void setUsageWeight(double usageWeight) {
        this.usageWeight = usageWeight;
    }

    public String getUsagePurpose() {
        return usagePurpose;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUsagePurpose(String usagePurpose) {
        this.usagePurpose = usagePurpose;
    }

    @Override
    public String toString() {
        return "PondInventory_Record{" + "pondInventoryID=" + pondInventoryID + ", pondInventoryTID=" + pondInventoryTID + ", faInventoryID=" + faInventoryID + ", usageDate=" + usageDate + ", dosage=" + dosage + ", usageWeight=" + usageWeight + ", usagePurpose=" + usagePurpose + '}';
    }
    
    
}
