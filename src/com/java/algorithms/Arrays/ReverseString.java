package com.java.algorithms.Arrays;

import java.util.ArrayList;

public class ReverseString {
    public static void main(String[] args) {
        String name = new String("Tina is my name");
        System.out.println(reverse(name));

    }

    public static String reverse(String arr) {
        String result = "";
        for (int i = arr.length()-1; i >= 0; i--) {
            char first = arr.charAt(i);
            result += arr.charAt(i);

        }
        return result;
    }


    public static String reverse2(String arr) {
        return new StringBuilder(arr).reverse().toString();

    }
}
