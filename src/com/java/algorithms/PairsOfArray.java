package com.java.algorithms;

public class PairsOfArray {
    public static void main(String [] args) {
        String [] numbers = new String[] {"a", "b", "c"};
        logAllPairs(numbers);
    }

    public static void logAllPairs(String [] num) {
        for(int i = 0; i <num.length; i++) {
            for(int j = 0; j < num.length; j++) {
                System.out.println(num[i] + " " + num[j]);
            }
        }
    }
}
