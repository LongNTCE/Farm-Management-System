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
public class PondEmployeeAuthorization {

    int pondEAID;
    int pondID;
    int employeeID;
    boolean allowInventoryRecord;
    boolean allowSurvivalRecord;
    boolean allowWaterRecord;

    public PondEmployeeAuthorization(int pondEAID, int pondID, int employeeID, boolean allowInventoryRecord, boolean allowSurvivalRecord, boolean allowWaterRecord) {
        this.pondEAID = pondEAID;
        this.pondID = pondID;
        this.employeeID = employeeID;
        this.allowInventoryRecord = allowInventoryRecord;
        this.allowSurvivalRecord = allowSurvivalRecord;
        this.allowWaterRecord = allowWaterRecord;
    }

    public int getPondEAID() {
        return pondEAID;
    }

    public void setPondEAID(int pondEAID) {
        this.pondEAID = pondEAID;
    }

    public int getPondID() {
        return pondID;
    }

    public void setPondID(int pondID) {
        this.pondID = pondID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public boolean isAllowInventoryRecord() {
        return allowInventoryRecord;
    }

    public void setAllowInventoryRecord(boolean allowInventoryRecord) {
        this.allowInventoryRecord = allowInventoryRecord;
    }

    public boolean isAllowSurvivalRecord() {
        return allowSurvivalRecord;
    }

    public void setAllowSurvivalRecord(boolean allowSurvivalRecord) {
        this.allowSurvivalRecord = allowSurvivalRecord;
    }

    public boolean isAllowWaterRecord() {
        return allowWaterRecord;
    }

    public void setAllowWaterRecord(boolean allowWaterRecord) {
        this.allowWaterRecord = allowWaterRecord;
    }

}