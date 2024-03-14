package com.java.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestPrefix {
    public static void main(String[] args) {
        String [] strings = {"flower", "flora", "flood"};
        System.out.println(longestCommonPrefix(strings));

    }

    public static String longestCommonPrefix(String [] strs) {
        Set<Character> set = new HashSet<>();
       for(int i = 0; i<strs.length; i++) {
           if(!set.contains(strs[i].charAt(i))) {
               set.add(strs[i].charAt(i));
           }
       }

        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
       return sb.toString();

    }
}
