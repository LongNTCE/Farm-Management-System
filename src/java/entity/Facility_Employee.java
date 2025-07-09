
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
/**
 *
 * @author Asus
 */
public class Facility_Employee {
    int facilityID;
    int employeeID;
    boolean allowFInventory;
    
    public Facility_Employee(){
        
    }
    public Facility_Employee(int facilityID, int employeeID, boolean allowFInventory) {
        this.facilityID = facilityID;
        this.employeeID = employeeID;
        this.allowFInventory = allowFInventory;
    }
    public int getFacilityID() {
        return facilityID;
    }
    public void setFacilityID(int facilityID) {
        this.facilityID = facilityID;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public boolean isAllowFInventory() {
        return allowFInventory;
    }
    public void setAllowFInventory(boolean allowFInventory) {
        this.allowFInventory = allowFInventory;
    }
    @Override
    public String toString() {
        return "Facility_Employee{" + "facilityID=" + facilityID + ", employeeID=" + employeeID + ", allowFInventory=" + allowFInventory + '}';
    }
    
    
}