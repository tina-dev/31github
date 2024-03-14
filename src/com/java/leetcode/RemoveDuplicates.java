package com.java.leetcode;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] numbers = {1,1,2};
        System.out.println(removeDuplicates(numbers));

    }

    public static int removeDuplicates(int [] nums) {
        int sol = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums) {
            set.add(num);
        }

        System.out.println(set);
        return sol;
    }
}
