package com.java.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        Arrays.stream(insertionSort(nums)).forEach(System.out::println);

    }

    public static int [] insertionSort(int [] nums) {
        int temp;
        for(int i = 0; i<nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
        return nums;

    }
}
