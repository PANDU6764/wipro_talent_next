package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {
    private String modelName;
    private String regNumber;
    private String ownerName;

    public Logan(String modelName, String regNumber, String ownerName) {
        this.modelName = modelName;
        this.regNumber = regNumber;
        this.ownerName = ownerName;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return regNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public int speed() {
        return 120;
    }

    public void gps() {
        System.out.println("Logan car: GPS navigation is active.");
    }
}
