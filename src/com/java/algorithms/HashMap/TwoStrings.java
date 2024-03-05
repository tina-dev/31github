package com.java.algorithms.HashMap;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    public static void main(String [] args) {
        String s = "be";
        String s2 = "are";
        System.out.println(twoString2(s, s2));

    }

    public static String twoString(String s1, String s2) {
        for(int i = 0; i<s1.length(); i++) {
            for(int j = 0; j<s2.length(); j++) {
                if(s1.charAt(i) == s2.charAt(j)) {
                    return "YES";
                }

            }
        }
        return "NO";
    }

    public static String twoString2(String s1, String s2) {
        Set<Character> set = new HashSet<>();

        for(int i = 0; i< s1.length(); i++) {
            set.add(s1.charAt(i));
        }

        for(int j = 0; j<s2.length(); j++) {
            if(set.contains(s2.charAt(j))) {
                return "YES";
            }
        }
        return "NO";
    }
}
