package com.java.OOP;

public class MainObject {
    public static void main(String [] args) {

        CarInheritance tesla = new CarInheritance(250.5f, 2500, "White", new int[] {40, 0, 0});
        tesla.engine.setValues(false, 300);
        tesla.engine.info();

        System.out.println("Tesla speed: " + tesla.color);

        //VehicleMain bmw = new CarInheritance(200, "White");
        //System.out.println(bmw.weight);

        Truck truck = new Truck("White", new int[] {20, 0, 1}, false);
        truck.engine.setValues(true, 200);
        truck.engine.info();

        truck.setLoaded(true);
        truck.getLoaded();

        System.out.println(truck.color);
    }
}
