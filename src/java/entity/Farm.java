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
public class Farm {
    private int farmID;
    private int userID;
    private String farmName;
    private String farmAddress;
    private double farmSquare;

    public Farm(int farmID, int userID, String farmName, String farmAddress, double farmSquare) {
        this.farmID = farmID;
        this.userID = userID;
        this.farmName = farmName;
        this.farmAddress = farmAddress;
        this.farmSquare = farmSquare;
    }
    
    public Farm(int farmID, String farmName, String farmAddress, double farmSquare) {
        this.farmID = farmID;
        this.userID = userID;
        this.farmName = farmName;
        this.farmAddress = farmAddress;
        this.farmSquare = farmSquare;
    }

    public Farm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getFarmID() {
        return farmID;
    }

    public void setFarmID(int farmID) {
        this.farmID = farmID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getFarmAddress() {
        return farmAddress;
    }

    public void setFarmAddress(String farmAddress) {
        this.farmAddress = farmAddress;
    }

    public double getFarmSquare() {
        return farmSquare;
    }

    public void setFarmSquare(double farmSquare) {
        this.farmSquare = farmSquare;
    }

   
    
}
