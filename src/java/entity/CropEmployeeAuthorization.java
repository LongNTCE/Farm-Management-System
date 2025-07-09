/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Admin
 */
public class CropEmployeeAuthorization {
    int cropEAID;
    int cropID;
    int employeeID;
    boolean allowBreedRecord;
    boolean allowHarvestRecord;
    boolean allowInventoryRecord;

    public CropEmployeeAuthorization(int cropEAID, int cropID, int employeeID, boolean allowBreedRecord, boolean allowHarvestRecord, boolean allowInventoryRecord) {
        this.cropEAID = cropEAID;
        this.cropID = cropID;
        this.employeeID = employeeID;
        this.allowBreedRecord = allowBreedRecord;
        this.allowHarvestRecord = allowHarvestRecord;
        this.allowInventoryRecord = allowInventoryRecord;
    }

    public int getCropEAID() {
        return cropEAID;
    }

    public void setCropEAID(int cropEAID) {
        this.cropEAID = cropEAID;
    }

    public int getCropID() {
        return cropID;
    }

    public void setCropID(int cropID) {
        this.cropID = cropID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public boolean isAllowBreedRecord() {
        return allowBreedRecord;
    }

    public void setAllowBreedRecord(boolean allowBreedRecord) {
        this.allowBreedRecord = allowBreedRecord;
    }

    public boolean isAllowHarvestRecord() {
        return allowHarvestRecord;
    }

    public void setAllowHarvestRecord(boolean allowHarvestRecord) {
        this.allowHarvestRecord = allowHarvestRecord;
    }

    public boolean isAllowInventoryRecord() {
        return allowInventoryRecord;
    }

    public void setAllowInventoryRecord(boolean allowInventoryRecord) {
        this.allowInventoryRecord = allowInventoryRecord;
    }

    @Override
    public String toString() {
        return "CropEmployeeAuthorization{" + "cropEAID=" + cropEAID + ", cropID=" + cropID + ", employeeID=" + employeeID + ", allowBreedRecord=" + allowBreedRecord + ", allowHarvestRecord=" + allowHarvestRecord + ", allowInventoryRecord=" + allowInventoryRecord + '}';
    }
    
}
