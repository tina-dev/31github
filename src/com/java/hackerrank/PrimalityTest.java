package com.java.hackerrank;

import java.math.BigInteger;

public class PrimalityTest {
    public static void main(String [] args) {
        int num = 1;
        isPrime(num);

    }

    public static void isPrime(int n) {
        if(n > 1 && n / n == 0) {
            System.out.println("not prime");
        }
        else {
            System.out.println("prime");
        }
    }

}
