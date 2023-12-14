package com.java.OOP;

public class Truck extends VehicleMain{

    private boolean isLoaded;

    public Truck(String color, int [] coordinate) {
        this.color = color;
        this.coordinate = coordinate;
    }

    public Truck(String color, int [] coordinate, boolean isLoaded) {
        this.color = color;
        this.coordinate = coordinate;
        this.isLoaded = isLoaded;
    }

    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public void getLoaded() {
        if(isLoaded) {
            System.out.println("Truck is loaded");
        }
        else {
            System.out.println("Not loaded");
        }
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Our object is moving with speed: " + speed);
    }
}
