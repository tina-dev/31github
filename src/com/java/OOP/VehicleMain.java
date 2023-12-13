package com.java.OOP;

public class VehicleMain {

    protected float speed;
    protected int weight;
    protected String color;
    protected int[] coordinate;

    public VehicleMain() {
    }

    public VehicleMain(float speed, int weight, String color, int [] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    public VehicleMain(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public VehicleMain(String color, int [] coordinate) {
        this.color = color;
        this.coordinate = coordinate;
    }

}
