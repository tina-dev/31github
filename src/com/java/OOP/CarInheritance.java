package com.java.OOP;

public class CarInheritance extends VehicleMain{

    public CarInheritance(float speed, int weight, String color, int [] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Our object is moving with speed: " + speed);
    }


}
