package com.java.algorithms.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayExceptSelf {
    public static void main(String [] args) {
        int [] numbers = {1,2,3,4};
        System.out.println(productExceptSelf(numbers));

    }

    public static List<Integer> productExceptSelf(int [] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length-1; i++) {
            int n = nums[i+1] * nums[i];
            list.add(n);
        }
        return list;
    }
}
