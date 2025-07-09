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
public class PondWaterEnv_Record {

    private int pondEnvID;
    private int pondWaterEnvTID;
    private Date envDate;
    private double dissolveOxygen_morning;
    private double dissolveOxygen_afternoon;
    private double pH_morning;
    private double pH_afternoon;
    private double temperature_morning;
    private double temperature_afternoon;
    private double salinity;
    private double purity;
    private double NH3;
    private double alkali;
    private double H2S;

    public PondWaterEnv_Record(int pondEnvID, int pondWaterEnvTID, Date envDate, double dissolveOxygen_morning, double dissolveOxygen_afternoon, double pH_morning, double pH_afternoon, double temperature_morning, double temperature_afternoon, double salinity, double purity, double NH3, double alkali, double H2S) {
        this.pondEnvID = pondEnvID;
        this.pondWaterEnvTID = pondWaterEnvTID;
        this.envDate = envDate;
        this.dissolveOxygen_morning = dissolveOxygen_morning;
        this.dissolveOxygen_afternoon = dissolveOxygen_afternoon;
        this.pH_morning = pH_morning;
        this.pH_afternoon = pH_afternoon;
        this.temperature_morning = temperature_morning;
        this.temperature_afternoon = temperature_afternoon;
        this.salinity = salinity;
        this.purity = purity;
        this.NH3 = NH3;
        this.alkali = alkali;
        this.H2S = H2S;
    }

    public int getPondEnvID() {
        return pondEnvID;
    }

    public void setPondEnvID(int pondEnvID) {
        this.pondEnvID = pondEnvID;
    }

    public int getPondWaterEnvTID() {
        return pondWaterEnvTID;
    }

    public void setPondWaterEnvTID(int pondWaterEnvTID) {
        this.pondWaterEnvTID = pondWaterEnvTID;
    }

    public Date getEnvDate() {
        return envDate;
    }

    public void setEnvDate(Date envDate) {
        this.envDate = envDate;
    }

    public double getDissolveOxygen_morning() {
        return dissolveOxygen_morning;
    }

    public void setDissolveOxygen_morning(double dissolveOxygen_morning) {
        this.dissolveOxygen_morning = dissolveOxygen_morning;
    }

    public double getDissolveOxygen_afternoon() {
        return dissolveOxygen_afternoon;
    }

    public void setDissolveOxygen_afternoon(double dissolveOxygen_afternoon) {
        this.dissolveOxygen_afternoon = dissolveOxygen_afternoon;
    }

    public double getpH_morning() {
        return pH_morning;
    }

    public void setpH_morning(double pH_morning) {
        this.pH_morning = pH_morning;
    }

    public double getpH_afternoon() {
        return pH_afternoon;
    }

    public void setpH_afternoon(double pH_afternoon) {
        this.pH_afternoon = pH_afternoon;
    }

    public double getTemperature_morning() {
        return temperature_morning;
    }

    public void setTemperature_morning(double temperature_morning) {
        this.temperature_morning = temperature_morning;
    }

    public double getTemperature_afternoon() {
        return temperature_afternoon;
    }

    public void setTemperature_afternoon(double temperature_afternoon) {
        this.temperature_afternoon = temperature_afternoon;
    }

    public double getSalinity() {
        return salinity;
    }

    public void setSalinity(double salinity) {
        this.salinity = salinity;
    }

    public double getPurity() {
        return purity;
    }

    public void setPurity(double purity) {
        this.purity = purity;
    }

    public double getNH3() {
        return NH3;
    }

    public void setNH3(double NH3) {
        this.NH3 = NH3;
    }

    public double getAlkali() {
        return alkali;
    }

    public void setAlkali(double alkali) {
        this.alkali = alkali;
    }

    public double getH2S() {
        return H2S;
    }

    public void setH2S(double H2S) {
        this.H2S = H2S;
    }

}
