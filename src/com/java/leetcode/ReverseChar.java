package com.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseChar {
    public static void main(String[] args) {
        char [] ch = {'h', 'e', 'l', 'l', 'o'};
        reverseString(ch);

    }

    public static void reverseString(char [] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
    }
}
