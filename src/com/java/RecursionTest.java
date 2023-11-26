package com.java;

public class RecursionTest {
    public static void main(String [] args) {
        System.out.println(sum(5));
    }

    public static int sum(int k) {
        if(k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
