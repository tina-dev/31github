package com.java.algorithms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation {
    public static void main(String [] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> nums = Arrays.asList(array);
        System.out.println(rotLeft(nums, 2));

    }


    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> array = new ArrayList<>();
        for(int i = 0; i<=d; i++) {
            for(int j = 0; j<a.size(); j++) {
                array.add(a.get(j - 1));

            }
        }
        return array;

    }
}
