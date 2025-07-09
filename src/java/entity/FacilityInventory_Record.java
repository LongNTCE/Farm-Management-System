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
public class FacilityInventory_Record {
    private int faInventoryID;
    private int fInventoryTID ;
    private String productName;
    private Date importDate;
    private int quantity;
    private String sourceName;
    private Date manurfacturingDate;
    private Date expireDate;

    public FacilityInventory_Record(int faInventoryID, int fInventoryTID, String productName, Date importDate, int quantity, String sourceName, Date manurfacturingDate, Date expireDate) {
        this.faInventoryID = faInventoryID;
        this.fInventoryTID = fInventoryTID;
        this.productName = productName;
        this.importDate = importDate;
        this.quantity = quantity;
        this.sourceName = sourceName;
        this.manurfacturingDate = manurfacturingDate;
        this.expireDate = expireDate;
    }

    public int getFaInventoryID() {
        return faInventoryID;
    }

    public void setFaInventoryID(int faInventoryID) {
        this.faInventoryID = faInventoryID;
    }

    public int getfInventoryTID() {
        return fInventoryTID;
    }

    public void setfInventoryTID(int fInventoryTID) {
        this.fInventoryTID = fInventoryTID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Date getManurfacturingDate() {
        return manurfacturingDate;
    }

    public void setManurfacturingDate(Date manurfacturingDate) {
        this.manurfacturingDate = manurfacturingDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        return "FacilityInventory_Record{" + "faInventoryID=" + faInventoryID + ", fInventoryTID=" + fInventoryTID + ", productName=" + productName + ", importDate=" + importDate + ", quantity=" + quantity + ", sourceName=" + sourceName + ", manurfacturingDate=" + manurfacturingDate + ", expireDate=" + expireDate + '}';
    }

       
    
}
