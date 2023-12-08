package com.java;

public class FunctionJava {
    public static void main(String [] args) {
        int [] nums = new int [] {5, 6, 7, 2};

        System.out.println(sum(nums));
    }

    public static int sum(int [] n) {
        int sum = 0;
        for(int i = 0; i<n.length; i++) {
            sum+=n[i];
        }
        return sum;

    }
}
