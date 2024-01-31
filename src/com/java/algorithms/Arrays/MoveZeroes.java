package com.java.algorithms.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {
    public static void main(String [] args) {
        int [] n = {0,1,0,3,12};

        System.out.println(moveZeroes(n));

    }

    public static List<Integer> moveZeroes(int [] nums) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] != 0) {
                numbers.add(nums[i]);
            }
        }
        for(int j = 0; j<nums.length; j++) {
            if(nums[j] == 0) {
                numbers.add(nums[j]);
            }
        }
        return numbers;
    }
}
