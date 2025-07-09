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
public class Pond {
    private int pondID;
    private String pondCode;
    private String pondName;
    private double pondSquare;
    public Pond(int pondID, String pondCode, String pondName, double pondSquare) {
        this.pondID = pondID;
        this.pondCode = pondCode;
        this.pondName = pondName;
        this.pondSquare = pondSquare;
    }
    @Override
    public String toString() {
        return "Pond{" + "pondID=" + pondID + ", pondCode=" + pondCode + ", pondName=" + pondName + ", pondSquare=" + pondSquare + '}';
    }
    public Pond(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Pond(int aInt, double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getPondID() {
        return pondID;
    }
    public void setPondID(int pondID) {
        this.pondID = pondID;
    }
    public String getPondCode() {
        return pondCode;
    }
    public void setPondCode(String pondCode) {
        this.pondCode = pondCode;
    }
    public String getPondName() {
        return pondName;
    }
    public void setPondName(String pondName) {
        this.pondName = pondName;
    }
    public double getPondSquare() {
        return pondSquare;
    }
    public void setPondSquare(double pondSquare) {
        this.pondSquare = pondSquare;
    }
    
}