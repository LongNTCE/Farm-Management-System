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
public class FacilityBreed_Table {
    private int fBreedTID;
    private int facilityID;
    private String fBreedTName;

    public FacilityBreed_Table(int fBreedTID, int facilityID, String fBreedTName) {
        this.fBreedTID = fBreedTID;
        this.facilityID = facilityID;
        this.fBreedTName = fBreedTName;
    }

    public int getfBreedTID() {
        return fBreedTID;
    }

    public void setfBreedTID(int fBreedTID) {
        this.fBreedTID = fBreedTID;
    }

    public int getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }

    public String getfBreedTName() {
        return fBreedTName;
    }

    public void setfBreedTName(String fBreedTName) {
        this.fBreedTName = fBreedTName;
    }

  
    
    
    
}