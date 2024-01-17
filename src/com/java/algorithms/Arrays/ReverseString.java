package com.java.algorithms.Arrays;

import java.util.ArrayList;

public class ReverseString {
    public static void main(String[] args) {
        String name = new String("Tina is my name");
        System.out.println(reverse2(name));

    }

    public static ArrayList<String> reverse(String arr) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = arr.length()-1; i >= 0; i--) {
            char first = arr.charAt(i);
            list.add(String.valueOf(first));

        }
        return list;
    }


    public static String reverse2(String arr) {
        return new StringBuilder(arr).reverse().toString();

    }
}
