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
public class PondWaterEnvironment_Table {
    private int pondWaterEnvTID;
    private int pondID;
    private String pondEnvTName;

    public PondWaterEnvironment_Table(int pondWaterEnvTID, int pondID, String pondEnvTName) {
        this.pondWaterEnvTID = pondWaterEnvTID;
        this.pondID = pondID;
        this.pondEnvTName = pondEnvTName;
    }

    public int getPondWaterEnvTID() {
        return pondWaterEnvTID;
    }

    public void setPondWaterEnvTID(int pondWaterEnvTID) {
        this.pondWaterEnvTID = pondWaterEnvTID;
    }

    public int getPondID() {
        return pondID;
    }

    public void setPondID(int pondID) {
        this.pondID = pondID;
    }

    public String getPondEnvTName() {
        return pondEnvTName;
    }

    public void setPondEnvTName(String pondEnvTName) {
        this.pondEnvTName = pondEnvTName;
    }
    
    
}
