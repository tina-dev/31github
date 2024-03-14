package com.java.leetcode;

import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 2));

    }

    public static int searchInsert(int [] nums, int target) {

        List<Integer> list = new ArrayList<>();

        for(int num: nums) {
            list.add(num);
        }

        if(list.contains(target)) {
            return list.indexOf(target);
        }
        else {
            list.add(target);
        }
        Collections.sort(list);

        return list.indexOf(target);
    }
}
