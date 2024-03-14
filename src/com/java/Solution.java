package com.java;

public class Solution {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazy dog";
        System.out.println(removeWhiteSpaces(s));
        makegGrid(s);

    }

    private static String removeWhiteSpaces(String s) {
        StringBuilder removedWhiteSpace = new StringBuilder();
        String [] sArr = s.split(" ");
        for(String item: sArr) {
            removedWhiteSpace.append(item);
        }
        return removedWhiteSpace.toString();
    }

    private static void makegGrid(String s) {
        int row = (int) Math.floor(Math.sqrt(s.length()));
        int col = (int) Math.ceil(Math.sqrt(s.length()));

        if(row * col < s.length()) {
            row = col;
        }

        char [] [] matrix = new char [row] [col];

        int k = 0;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j< col; j++) {
                if(k < s.length()) {
                    matrix[i] [j] = s.charAt(k);
                }
                k++;
            }
        }

        for(int i  = 0; i < row; i++) {
            for(int j =0; j < col; j++) {
                if(matrix[i][j] == 0) {
                    break;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println("");

        }
    }


}
