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
public class Facility {

    public Facility(int facilityID, int foID, String fName, String fAddress, String fPhone, double fTotalSquare, double fCultivatingPondSquare, double fStoragePondSquare, double fWastePondSquare, String fCultivatingObject, int fCultivatingTime) {
        this.facilityID = facilityID;
        this.foID = foID;
        this.fName = fName;
        this.fAddress = fAddress;
        this.fPhone = fPhone;
        this.fTotalSquare = fTotalSquare;
        this.fCultivatingPondSquare = fCultivatingPondSquare;
        this.fStoragePondSquare = fStoragePondSquare;
        this.fWastePondSquare = fWastePondSquare;
        this.fCultivatingObject = fCultivatingObject;
        this.fCultivatingTime = fCultivatingTime;
    }
    private int facilityID;
    private int foID;
    private String fName;
    private String fAddress;
    private String fPhone;

    public double getfTotalSquare() {
        return fTotalSquare;
    }

    public void setfTotalSquare(double fTotalSquare) {
        this.fTotalSquare = fTotalSquare;
    }
    private double fTotalSquare;
    private double fCultivatingPondSquare;
    private double fStoragePondSquare;
    private double fWastePondSquare;
    private String fCultivatingObject;
    private int fCultivatingTime;

    public Facility(int facilityID, int foID, String fName, String fAddress, String fPhone, double fCultivatingPondSquare, double fStoragePondSquare, double fWastePondSquare, String fCultivatingObject, int fCultivatingTime) {
        this.facilityID = facilityID;
        this.foID = foID;
        this.fName = fName;
        this.fAddress = fAddress;
        this.fPhone = fPhone;
        this.fCultivatingPondSquare = fCultivatingPondSquare;
        this.fStoragePondSquare = fStoragePondSquare;
        this.fWastePondSquare = fWastePondSquare;
        this.fCultivatingObject = fCultivatingObject;
        this.fCultivatingTime = fCultivatingTime;
    }

    public int getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }

    public int getFoID() {
        return foID;
    }

    public void setFoID(int foID) {
        this.foID = foID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfAddress() {
        return fAddress;
    }

    public void setfAddress(String fAddress) {
        this.fAddress = fAddress;
    }

    public String getfPhone() {
        return fPhone;
    }

    public void setfPhone(String fPhone) {
        this.fPhone = fPhone;
    }

    public double getfCultivatingPondSquare() {
        return fCultivatingPondSquare;
    }

    public void setfCultivatingPondSquare(double fCultivatingPondSquare) {
        this.fCultivatingPondSquare = fCultivatingPondSquare;
    }

    public double getfStoragePondSquare() {
        return fStoragePondSquare;
    }

    public void setfStoragePondSquare(double fStoragePondSquare) {
        this.fStoragePondSquare = fStoragePondSquare;
    }

    public double getfWastePondSquare() {
        return fWastePondSquare;
    }

    public void setfWastePondSquare(double fWastePondSquare) {
        this.fWastePondSquare = fWastePondSquare;
    }

    public String getfCultivatingObject() {
        return fCultivatingObject;
    }

    public void setfCultivatingObject(String fCultivatingObject) {
        this.fCultivatingObject = fCultivatingObject;
    }

    public int getfCultivatingTime() {
        return fCultivatingTime;
    }

    public void setfCultivatingTime(int fCultivatingTime) {
        this.fCultivatingTime = fCultivatingTime;
    }

    
    
}
