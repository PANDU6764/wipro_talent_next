package com.automobile.fourwheeler;
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

@SuppressWarnings("unused")
public class TestVehicle {
    public static void main(String[] args) {
        Hero heroBike = new Hero("Hero Splendor", "AP16AB1234", "Ravi Kumar");
        Honda hondaCar = new Honda("Honda City", "TS09GH5678", "Sita Devi");
        Logan loganCar = new Logan("Renault Logan", "MH12XY9999", "Arjun Rao");
        Ford fordCar = new Ford("Ford EcoSport", "DL10AZ8888", "Pooja Singh");

        System.out.println("=== Hero Bike ===");
        System.out.println("Model: " + heroBike.getModelName());
        System.out.println("Reg No: " + heroBike.getRegistrationNumber());
        System.out.println("Owner: " + heroBike.getOwnerName());
        System.out.println("Speed: " + heroBike.getSpeed());
        heroBike.radio();

        System.out.println("\n=== Honda Car ===");
        System.out.println("Model: " + hondaCar.getModelName());
        System.out.println("Reg No: " + hondaCar.getRegistrationNumber());
        System.out.println("Owner: " + hondaCar.getOwnerName());
        System.out.println("Speed: " + hondaCar.getSpeed());
        hondaCar.cdplayer();

        System.out.println("\n=== Logan Car ===");
        System.out.println("Model: " + loganCar.getModelName());
        System.out.println("Reg No: " + loganCar.getRegistrationNumber());
        System.out.println("Owner: " + loganCar.getOwnerName());
        System.out.println("Speed: " + loganCar.speed());
        loganCar.gps();

        System.out.println("\n=== Ford Car ===");
        System.out.println("Model: " + fordCar.getModelName());
        System.out.println("Reg No: " + fordCar.getRegistrationNumber());
        System.out.println("Owner: " + fordCar.getOwnerName());
        System.out.println("Speed: " + fordCar.speed());
        fordCar.tempControl();
    }
}
