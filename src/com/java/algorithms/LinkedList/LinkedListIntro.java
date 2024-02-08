package com.java.algorithms.LinkedList;

import java.util.LinkedList;

public class LinkedListIntro {
    public static void main(String [] args) {
        int [] nums = {1, 4, 2, 6};
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for( int lists: list) {
            System.out.print(lists);

        }
        System.out.println(reverse(nums));
    }

    public static LinkedList<Integer> reverse(int [] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = nums.length-1; i>=0; i--) {
            list.add(nums[i]);

        }
        return list;
    }
}
