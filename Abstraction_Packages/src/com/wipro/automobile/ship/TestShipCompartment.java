package com.wipro.automobile.ship;

import com.wipro.automobile.ship.Compartment;

@SuppressWarnings("unused")
public class TestShipCompartment {
    public static void main(String[] args) {
        Compartment shipCompartment = new Compartment(10.5, 8.0, 6.2);
        shipCompartment.displayDimensions();
    }
}
