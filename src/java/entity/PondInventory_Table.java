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
public class PondInventory_Table {
    private int pondInventoryTID;
    private int pondID;
    private String pondInventoryTName;

    public PondInventory_Table(int pondInventoryTID, int pondID, String pondInventoryTName) {
        this.pondInventoryTID = pondInventoryTID;
        this.pondID = pondID;
        this.pondInventoryTName = pondInventoryTName;
    }

    public int getPondInventoryTID() {
        return pondInventoryTID;
    }

    public void setPondInventoryTID(int pondInventoryTID) {
        this.pondInventoryTID = pondInventoryTID;
    }

    public int getPondID() {
        return pondID;
    }

    public void setPondID(int pondID) {
        this.pondID = pondID;
    }

    public String getPondInventoryTName() {
        return pondInventoryTName;
    }

    public void setPondInventoryTName(String pondInventoryTName) {
        this.pondInventoryTName = pondInventoryTName;
    }
    
    
}
