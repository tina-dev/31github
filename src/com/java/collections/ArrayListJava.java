package com.java.collections;

import java.util.ArrayList;

public class ArrayListJava {
    public static void main(String [] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(1, 3);

        for(Integer num: numbers) {
            System.out.println(num);
        }

    }
 }
