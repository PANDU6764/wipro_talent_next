package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {
    private String modelName;
    private String regNumber;
    private String ownerName;

    public Ford(String modelName, String regNumber, String ownerName) {
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
        return 130;
    }

    public void tempControl() {
        System.out.println("Ford car: Air Conditioning system is set to auto mode.");
    }
}
