package com.java.algorithms.HashMap;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurring {
    public static void main(String [] args) {
        int [] num = {1, 2, 3, 4, 5, 2};
        recurring(num);

    }

    public static void recurring(int [] nums) {

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                System.out.println(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
    }
}
