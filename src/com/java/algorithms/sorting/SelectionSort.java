package com.java.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        Arrays.stream(selectionSort(nums)).forEach(System.out::println);

    }

    public static int [] selectionSort(int [] nums) {
        for(int i = 0; i<nums.length; i++) {
            int min = i;
            int temp = nums[i];
            for(int j = i+1; j<nums.length; j++) {
                if(nums[min] > nums[j]) {
                    min = j;
                }
            }
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return nums;
    }


}
