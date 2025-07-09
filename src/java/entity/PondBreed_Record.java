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
public class PondBreed_Record {
    private int pondBreedID;
    private int pondID;
    private Date breedDate;
    private double breedSize;
    private int breedDensity;
    private String breedSourceName;
    private String breedCertificateID;

    public PondBreed_Record(int pondBreedID, int pondID, Date breedDate, double breedSize, int breedDensity, String breedSourceName, String breedCertificateID) {
        this.pondBreedID = pondBreedID;
        this.pondID = pondID;
        this.breedDate = breedDate;
        this.breedSize = breedSize;
        this.breedDensity = breedDensity;
        this.breedSourceName = breedSourceName;
        this.breedCertificateID = breedCertificateID;
    }

    public int getPondBreedID() {
        return pondBreedID;
    }

    public void setPondBreedID(int pondBreedID) {
        this.pondBreedID = pondBreedID;
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

    
    
}