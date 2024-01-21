package com.java.algorithms.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String [] args) {
        System.out.println(containsDuplicate(new int [] {1, 2, 4, 3}));
    }

    public static boolean containsDuplicate(int [] nums) {
        List<Integer> list = new ArrayList<>();
            for(int num: nums) {
                if(list.contains(num)) {
                    return true;
                }
                list.add(num);
            }
            return false;
    }
}
