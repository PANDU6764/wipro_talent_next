package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
    private String modelName;
    private String regNumber;
    private String ownerName;

    public Hero(String modelName, String regNumber, String ownerName) {
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

    public int getSpeed() {
        return 80; // Example speed
    }

    public void radio() {
        System.out.println("Hero bike: Radio is ON.");
    }
}
