package com.java.OOP;

public class PolymorphismJava {
    public static void main(String [] args) {
        Shapes myShape = new Shapes();
        Shapes myTriangle = new Triangle();
        myShape.area();
        myTriangle.area();

    }
}
