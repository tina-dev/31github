package com.java.OOP;

public abstract class VehicleMain {

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

    public abstract void moveObject(float speed);

    class Engine {
        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;
        }

        public void info() {
            if(isReady)
                System.out.println("Engine is good");
            else
                System.out.println("Not ready");
        }
    }

}
