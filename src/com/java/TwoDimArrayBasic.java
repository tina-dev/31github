package com.java;

public class TwoDimArrayBasic {
    public static void main(String [] args) {

        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        int[][] nums = new int[][] {
                {5, 7},
                {3, 1},
                {2, 9}
        };
        System.out.println(nums[2][0]);

    }
}
