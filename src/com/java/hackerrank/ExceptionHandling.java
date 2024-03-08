package com.java.hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter first integer: ");

            int x = scanner.nextInt();

            System.out.println("Enter second integer: ");

            int y = scanner.nextInt();
            int result = x / y;
            System.out.println(result);
        }
        catch (InputMismatchException e) {
            //System.out.println("InputMismatchException");
        }
        catch (ArithmeticException e) {
            //System.out.println("java.lang.ArithmeticException: / by zero");

        }
    }
}
