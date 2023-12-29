package com.java.algorithms;

import java.util.HashMap;
import java.util.Map;

public class PairWithSum {
    public static void main(String [] args) {
        int [] nums = {2,3,4,4};
        int summ = 8;
        System.out.println(hasPairWithSum(nums, summ));

    }

    public static boolean hasPairWithSum(int [] arr, int sum) {
        int len = arr.length;
        for(int i = 0; i < len-1; i++) {
            for(int j = i+1; j < len; j++) {
                if(arr[j] + arr[j] == sum) {
                    return true;
                }
            }
        }
        return false;
    }


}
