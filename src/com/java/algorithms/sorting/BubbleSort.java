package com.java.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        Arrays.stream(bubbleSort(nums)).forEach(System.out::println);

    }

    public static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
