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
public class PondSurvivalRate_Table {
    private int pondSurvivalRateTID;
    private int pondID;
    private String pondSurvivalRateTName;

    public PondSurvivalRate_Table(int pondSurvivalRateTID, int pondID, String pondSurvivalRateTName) {
        this.pondSurvivalRateTID = pondSurvivalRateTID;
        this.pondID = pondID;
        this.pondSurvivalRateTName = pondSurvivalRateTName;
    }

    public int getPondSurvivalRateTID() {
        return pondSurvivalRateTID;
    }

    public void setPondSurvivalRateTID(int pondSurvivalRateTID) {
        this.pondSurvivalRateTID = pondSurvivalRateTID;
    }

    public int getPondID() {
        return pondID;
    }

    public void setPondID(int pondID) {
        this.pondID = pondID;
    }

    public String getPondSurvivalRateTName() {
        return pondSurvivalRateTName;
    }

    public void setPondSurvivalRateTName(String pondSurvivalRateTName) {
        this.pondSurvivalRateTName = pondSurvivalRateTName;
    }


    
    
}
