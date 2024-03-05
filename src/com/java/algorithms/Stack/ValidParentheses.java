package com.java.algorithms.Stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String [] args) {
        String charachters = "()";
        System.out.println(isValid(charachters));

    }

    public static boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                chars.push((char) i);
                System.out.println(chars);
            }

        }
        return true;

    }
}
