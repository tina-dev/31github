package com.java.algorithms.sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        int [] nums = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println(bubbleSorting(nums));

    }

    public static int bubbleSorting(int [] numbers) {
        int temp = 0;
        for(int i = 0; i<numbers.length; i++) {
            for(int j = i+1; j<numbers.length; j++) {
                if(numbers[i] < numbers[j]) {
                    temp = numbers[i];
                }
            }
        }
        return temp;
    }
}
