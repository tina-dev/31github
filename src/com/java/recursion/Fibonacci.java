package com.java.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibonacciRecursion(n));
        System.out.println(fibonacciIterative(n));

    }

    public static int fibonacciIterative(int n) {
        int fib = 0;
        for(int i = 2; i<=n;i++) {
            fib += (n-1) + (n-2);
        }
        return fib;

    }

    public static int fibonacciRecursion(int n) {
        if (n < 2) // base case
            return n;
        else
            return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);

    }
}
