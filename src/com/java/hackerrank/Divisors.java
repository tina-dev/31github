package com.java.hackerrank;

import com.sun.security.jgss.GSSUtil;

public class Divisors {
    public static void main(String [] args) {
        int n = 6;
        System.out.println(divisor(n));

    }
    public static int divisor(int n) {
        int sum = 0;
        for(int i = n; i >0; i--) {
            if(n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
