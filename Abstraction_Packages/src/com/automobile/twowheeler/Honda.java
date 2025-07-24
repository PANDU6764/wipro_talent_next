package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {
    private String modelName;
    private String regNumber;
    private String ownerName;

    public Honda(String modelName, String regNumber, String ownerName) {
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
        return 100; // Example speed
    }

    public void cdplayer() {
        System.out.println("Honda car: CD Player is playing.");
    }
}
