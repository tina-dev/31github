package com.java.OOP;

public class VehicleMain {

    public float speed;
    public int weight;
    public String color;
    public int[] coordinate;

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

}
