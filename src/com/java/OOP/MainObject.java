package com.java.OOP;

public class MainObject {
    public static void main(String [] args) {

        VehicleMain tesla = new VehicleMain();
        tesla.speed = 250.5f;
        tesla.weight = 2500;
        tesla.color = "White";
        tesla.coordinate = new int[] {40, 0, 0};

        System.out.println("Tesla speed: " + tesla.speed);
    }
}
