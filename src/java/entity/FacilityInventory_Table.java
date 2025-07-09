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
public class FacilityInventory_Table {
    private int fInventoryTID;
    private int facilityID;
    private String fInventoryTName;

    public FacilityInventory_Table(int fInventoryTID, int facilityID, String fInventoryTName) {
        this.fInventoryTID = fInventoryTID;
        this.facilityID = facilityID;
        this.fInventoryTName = fInventoryTName;
    }

    public int getfInventoryTID() {
        return fInventoryTID;
    }

    public void setfInventoryTID(int fInventoryTID) {
        this.fInventoryTID = fInventoryTID;
    }

    public int getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }

    public String getfInventoryTName() {
        return fInventoryTName;
    }

    public void setfInventoryTName(String fInventoryTName) {
        this.fInventoryTName = fInventoryTName;
    }
    
    
}
