package com.java.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfArrays {
    public static void main(String[] args) {

        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};
        System.out.println(intersection(nums1, nums2));

    }

    public static Set<Integer> intersection(int [] nums1, int [] nums2) {
        Set<Integer> list = new HashSet<>();

        for(int i = 0; i<nums1.length; i++) {
            for(int j = 0; j<nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                }
            }
        }
        return list;
    }



}
