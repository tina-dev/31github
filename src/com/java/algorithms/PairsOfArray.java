package com.java.algorithms;

public class PairsOfArray {
    public static void main(String [] args) {
        int [] numbers = new int[] {1,2,3,4,5};
        logAllPairs(numbers);
    }

    public static void logAllPairs(int [] num) {
        for(int i = 0; i <num.length; i++) {
            for(int j = 0; j < num.length; j++) {
                System.out.println(num[i] + " " + num[j]);
            }
        }
    }
}
