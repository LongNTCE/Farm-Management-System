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
public class FacilityHarvest_Table {
    private int fHarvestTID;
    private int facilityID;
    private String fHarvestTName;

    public FacilityHarvest_Table(int fHarvestTID, int facilityID, String fHarvestTName) {
        this.fHarvestTID = fHarvestTID;
        this.facilityID = facilityID;
        this.fHarvestTName = fHarvestTName;
    }

    public int getfHarvestTID() {
        return fHarvestTID;
    }

    public void setfHarvestTID(int fHarvestTID) {
        this.fHarvestTID = fHarvestTID;
    }

    public int getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }

    public String getfHarvestTName() {
        return fHarvestTName;
    }

    public void setfHarvestTName(String fHarvestTName) {
        this.fHarvestTName = fHarvestTName;
    }


    
}
