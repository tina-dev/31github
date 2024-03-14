package com.java.leetcode;

import java.util.HashSet;
import java.util.Set;

public class MinCommonValue {
    public static void main(String[] args) {
        int [] num1 = {1,2};
        int [] num2 = {2,4};

        System.out.println(getCommon(num1, num2));

    }

    public static int getCommon(int [] num1, int [] num2) {
        Set<Integer> set = new HashSet<>();

        for(int num: num1) {
            set.add(num);
        }

        for(int nums: num2) {
            if(set.contains(nums)) {
                return nums;
            }
        }
        return -1;
    }

}
