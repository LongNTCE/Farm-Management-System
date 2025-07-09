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
public class FacilityOwner {

    private int foID;
    private String foFullName;
    private String foEmail;
    private String foPassword;
    private String foPhone;
   

    public FacilityOwner(int userID, String userName, String userEmail, String userPassword, String userPhone) {
        this.foID = userID;
        this.foFullName = userName;
        this.foEmail = userEmail;
        this.foPassword = userPassword;
        this.foPhone = userPhone;
    
    }

    public int getFoID() {
        return foID;
    }

    public void setFoID(int foID) {
        this.foID = foID;
    }

    public String getFoFullName() {
        return foFullName;
    }

    public void setFoFullName(String foFullName) {
        this.foFullName = foFullName;
    }

    public String getFoEmail() {
        return foEmail;
    }

    public void setFoEmail(String foEmail) {
        this.foEmail = foEmail;
    }

    public String getFoPassword() {
        return foPassword;
    }

    public void setFoPassword(String foPassword) {
        this.foPassword = foPassword;
    }

    public String getFoPhone() {
        return foPhone;
    }

    public void setFoPhone(String foPhone) {
        this.foPhone = foPhone;
    }

    @Override
    public String toString() {
        return "FacilityOwner{" + "foID=" + foID + ", foFullName=" + foFullName + ", foEmail=" + foEmail + ", foPassword=" + foPassword + ", foPhone=" + foPhone + '}';
    }


    

    
    
    
}
