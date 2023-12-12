package com.java.OOP;

public class MainObject {
    public static void main(String [] args) {

        VehicleMain tesla = new VehicleMain(250.5f, 2500, "White", new int[] {40, 0, 0});
//        tesla.speed = 250.5f;
//        tesla.weight = 2500;
//        tesla.color = "White";
//        tesla.coordinate = new int[] {40, 0, 0};

        System.out.println("Tesla speed: " + tesla.color);

        VehicleMain bmw = new VehicleMain(200, "White");
        System.out.println(bmw.weight);

        VehicleMain lexus = new VehicleMain("White", new int[] {20, 0, 1});

        System.out.println(lexus.color);
    }
}
