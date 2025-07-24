package com.wipro.automobile.ship;

public class Compartment {
    private double height;
    private double width;
    private double breadth;

    // Constructor
    public Compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    // Getters
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getBreadth() {
        return breadth;
    }

    // Volume calculation
    public double getVolume() {
        return height * width * breadth;
    }

    // Display method
    public void displayDimensions() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Breadth: " + breadth);
        System.out.println("Volume: " + getVolume());
    }
}
