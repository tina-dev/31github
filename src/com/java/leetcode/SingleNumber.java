package com.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
    public static void main(String[] args) {

        int [] nums = {2,2,1};
        System.out.println(singleNum(nums));

    }

    public static List<Integer> singleNum(int [] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num: nums) {
            if(list.contains(num)) {
                return list;
            }
            list.add(num);
        }
        return list;
    }
}
