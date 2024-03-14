package com.java.recursion;

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(findFactorial2(number));

    }

    public static int findFactorial(int number) {
        int fact = 1;

        for(int i = 2; i<=number; i++) {
            fact *=i;
        }

        return fact;
    }

    public static int findFactorial2(int number) {
        if (number <= 1) // base case
            return 1;
        else
            return number*findFactorial2(number-1);
    }
}
