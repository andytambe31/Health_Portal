/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class VitalSigns {
    
    private double bloodPressure_LOW;
    private double bloodPressure_HIGH;
    private double heartRate;
    
    public VitalSigns(double bloodPressure_LOW,double bloodPressure_HIGH,double heartRate){
        this.heartRate = heartRate;
        this.bloodPressure_LOW = bloodPressure_LOW;
        this.bloodPressure_HIGH = bloodPressure_HIGH;
    }

    public double getBloodPressure_LOW() {
        return bloodPressure_LOW;
    }

    public void setBloodPressure_LOW(double bloodPressure_LOW) {
        this.bloodPressure_LOW = bloodPressure_LOW;
    }

    public void setBloodPressure_HIGH(double bloodPressure_HIGH) {
        this.bloodPressure_HIGH = bloodPressure_HIGH;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }
    
    public double getBloodPressure_HIGH() {
        return bloodPressure_HIGH;
    }

    public double getHeartRate() {
        return heartRate;
    }
    
    
}
