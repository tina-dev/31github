package com.java.leetcode;

public class PalindromeNumber {
    public static void main(String [] args) {
        System.out.println(isPalindrome(121));

    }
    
    public static boolean isPalindrome(int x) {
        int palindrome = x;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (x == reverse) {
            return true;
        }
        return false;
    }
}

