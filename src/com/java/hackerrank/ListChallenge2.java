package com.java.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListChallenge2 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(0);
        nums.add(1);
        nums.add(78);
        nums.add(12);

        nums.add(5, 23);
        nums.remove(0);

        // Print elements without brackets
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i));
            if (i < nums.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
