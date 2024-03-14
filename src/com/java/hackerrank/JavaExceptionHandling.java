package com.java.hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;



public class JavaExceptionHandling  {
    public static void main(String [] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");

        int n = scanner.nextInt();

        System.out.println("Enter second number: ");

        int p = scanner.nextInt();

        try {


            int power = (int) Math.pow(n, p);

            if(n == 0  && p == 0) {
                throw new Exception("java.lang.Exception: n and p should not be zero.\n");

            }
             else if(n < 0 || p < 0) {
                throw new Exception("java.lang.Exception: n or p should not be negative.\n");
            }


            System.out.println(power);


        }

        catch (Exception e) {
            System.out.println(e.getMessage());



        }


    }
}
