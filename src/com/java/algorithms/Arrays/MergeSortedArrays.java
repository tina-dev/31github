package com.java.algorithms.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {

    public static void main(String [] args) {
        List<Integer> numbers = mergeArrays(new int [] {1,2,3}, new int [] {3,4,5});
        System.out.println(numbers);

    }

    public static List<Integer> mergeArrays(int [] num1, int [] num2) {
        List<Integer> merge = new ArrayList<>();
        for(int i = 0; i<num1.length; i++) {
            merge.add(num1[i]);
        }
        for(int j = 0; j<num2.length; j++) {
            merge.add(num2[j]);
        }
        return merge;
    }
}