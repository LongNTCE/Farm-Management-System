
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
public class FacilityBreed_Record {

    private int fBreedID;
    private int fBreedTID;
    private int pondID;
    public double pondSquare;
    private Date breedDate;
    private double breedSize;
    private int breedDensity;
    private String breedSourceName;
    private String breedCertificateID;
    private String pondName;

    public FacilityBreed_Record(int fBreedID, int fBreedTID, int pondID, double pondSquare, Date breedDate, double breedSize, int breedDensity, String breedSourceName, String breedCertificateID, String pondName) {
        this.fBreedID = fBreedID;
        this.fBreedTID = fBreedTID;
        this.pondID = pondID;
        this.pondSquare = pondSquare;
        this.breedDate = breedDate;
        this.breedSize = breedSize;
        this.breedDensity = breedDensity;
        this.breedSourceName = breedSourceName;
        this.breedCertificateID = breedCertificateID;
        this.pondName = pondName;
    }

    public String getPondName() {
        return pondName;
    }

    public void setPondName(String pondName) {
        this.pondName = pondName;
    }

    public FacilityBreed_Record(int fBreedID, int fBreedTID, int pondID, Date breedDate, double breedSize, int breedDensity, String breedSourceName, String breedCertificateID) {
        this.fBreedID = fBreedID;
        this.fBreedTID = fBreedTID;
        this.pondID = pondID;
        this.breedDate = breedDate;
        this.breedSize = breedSize;
        this.breedDensity = breedDensity;
        this.breedSourceName = breedSourceName;
        this.breedCertificateID = breedCertificateID;
    }

    public FacilityBreed_Record(int fBreedID, int fBreedTID, int pondID, double pondSquare, Date breedDate, double breedSize, int breedDensity, String breedSourceName, String breedCertificateID) {
        this.fBreedID = fBreedID;
        this.fBreedTID = fBreedTID;
        this.pondID = pondID;
        this.pondSquare = pondSquare;
        this.breedDate = breedDate;
        this.breedSize = breedSize;
        this.breedDensity = breedDensity;
        this.breedSourceName = breedSourceName;
        this.breedCertificateID = breedCertificateID;
    }

    public int getfBreedID() {
        return fBreedID;
    }

    public void setfBreedID(int fBreedID) {
        this.fBreedID = fBreedID;
    }

    public int getfBreedTID() {
        return fBreedTID;
    }

    public void setfBreedTID(int fBreedTID) {
        this.fBreedTID = fBreedTID;
    }

    public int getPondID() {
        return pondID;
    }

    public void setPondID(int pondID) {
        this.pondID = pondID;
    }

    public Date getBreedDate() {
        return breedDate;
    }

    public void setBreedDate(Date breedDate) {
        this.breedDate = breedDate;
    }

    public double getBreedSize() {
        return breedSize;
    }

    public void setBreedSize(double breedSize) {
        this.breedSize = breedSize;
    }

    public int getBreedDensity() {
        return breedDensity;
    }

    public void setBreedDensity(int breedDensity) {
        this.breedDensity = breedDensity;
    }

    public String getBreedSourceName() {
        return breedSourceName;
    }

    public void setBreedSourceName(String breedSourceName) {
        this.breedSourceName = breedSourceName;
    }

    public String getBreedCertificateID() {
        return breedCertificateID;
    }

    public void setBreedCertificateID(String breedCertificateID) {
        this.breedCertificateID = breedCertificateID;
    }

    public double getPondSquare() {
        return pondSquare;
    }

    public void setPondSquare(double pondSquare) {
        this.pondSquare = pondSquare;
    }

}
