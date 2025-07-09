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
public class PondSurvivalRate_Record {
    private int pondSurvivalRateID;
    private int pondSurvivalRateTID;
    private Date survivalDate;
    private double survivalMediumWeight;
    private int deathNumber;
    private int lossNumber;
    private double diseaseNumber;
    private String diseaseSign;
    private double estimateSurvivalRate;

    public PondSurvivalRate_Record(int pondSurvivalRateID, int pondSurvivalRateTID, Date survivalDate, double survivalMediumWeight, int deathNumber, int lossNumber, double diseaseNumber, String diseaseSign, double estimateSurvivalRate) {
        this.pondSurvivalRateID = pondSurvivalRateID;
        this.pondSurvivalRateTID = pondSurvivalRateTID;
        this.survivalDate = survivalDate;
        this.survivalMediumWeight = survivalMediumWeight;
        this.deathNumber = deathNumber;
        this.lossNumber = lossNumber;
        this.diseaseNumber = diseaseNumber;
        this.diseaseSign = diseaseSign;
        this.estimateSurvivalRate = estimateSurvivalRate;
    }

    public int getPondSurvivalRateID() {
        return pondSurvivalRateID;
    }

    public void setPondSurvivalRateID(int pondSurvivalRateID) {
        this.pondSurvivalRateID = pondSurvivalRateID;
    }

    public int getPondSurvivalRateTID() {
        return pondSurvivalRateTID;
    }

    public void setPondSurvivalRateTID(int pondSurvivalRateTID) {
        this.pondSurvivalRateTID = pondSurvivalRateTID;
    }

    public Date getSurvivalDate() {
        return survivalDate;
    }

    public void setSurvivalDate(Date survivalDate) {
        this.survivalDate = survivalDate;
    }

    public double getSurvivalMediumWeight() {
        return survivalMediumWeight;
    }

    public void setSurvivalMediumWeight(double survivalMediumWeight) {
        this.survivalMediumWeight = survivalMediumWeight;
    }

    public int getDeathNumber() {
        return deathNumber;
    }

    public void setDeathNumber(int deathNumber) {
        this.deathNumber = deathNumber;
    }

    public int getLossNumber() {
        return lossNumber;
    }

    public void setLossNumber(int lossNumber) {
        this.lossNumber = lossNumber;
    }

    public double getDiseaseNumber() {
        return diseaseNumber;
    }

    public void setDiseaseNumber(double diseaseNumber) {
        this.diseaseNumber = diseaseNumber;
    }

    public String getDiseaseSign() {
        return diseaseSign;
    }

    public void setDiseaseSign(String diseaseSign) {
        this.diseaseSign = diseaseSign;
    }

    public double getEstimateSurvivalRate() {
        return estimateSurvivalRate;
    }

    public void setEstimateSurvivalRate(double estimateSurvivalRate) {
        this.estimateSurvivalRate = estimateSurvivalRate;
    }

    
    
    
}
