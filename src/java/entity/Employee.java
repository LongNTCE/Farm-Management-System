
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
public class Employee {
    private int employeeID;
    private String employeeFullName;
    private String employeeEmail;
    private String employeePassword;
    private String employeePhone;
    public Employee(int employeeID, String employeeFullName, String employeeEmail, String employeePassword, String employeePhone) {
        this.employeeID = employeeID;
        this.employeeFullName = employeeFullName;
        this.employeeEmail = employeeEmail;
        this.employeePassword = employeePassword;
        this.employeePhone = employeePhone;
    }
    
 public Employee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public String getEmployeeFullName() {
        return employeeFullName;
    }
    public void setEmployeeFullName(String employeeFullName) {
        this.employeeFullName = employeeFullName;
    }
    public String getEmployeeEmail() {
        return employeeEmail;
    }
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
    public String getEmployeePassword() {
        return employeePassword;
    }
    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }
    public String getEmployeePhone() {
        return employeePhone;
    }
    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "employeeID=" + employeeID + ", employeeFullName=" + employeeFullName + ", employeeEmail=" + employeeEmail + ", employeePassword=" + employeePassword + ", employeePhone=" + employeePhone + '}';
    }
    
    
}