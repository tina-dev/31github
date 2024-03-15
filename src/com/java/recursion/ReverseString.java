package com.java.recursion;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        String s = "tina";
        System.out.println(reverseString(s));
        System.out.println(reverseRecursive(s));

    }

    public static String reverseString(String s) {
        String result = "";
        for(int i = s.length()-1; i>=0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static String reverseRecursive(String s) {
        if(s.length() == 0) {
            return "";

        }
        else
            return reverseRecursive(s.substring(1)) + s.charAt(0);



    }
}
