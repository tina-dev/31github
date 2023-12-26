package com.java.algorithms;

public class CommonItems {
    public static void main(String [] args) {
        String [] arr = {"a", "b", "c"};
        String [] arr2 = {"a", "d", "e"};
        System.out.println(itemsContains(arr, arr2));

    }

    public static boolean itemsContains(String [] array1, String [] array2) {
        for(int i = 0; i<array1.length; i++) {
            for (int j = 0; j<array2.length; j++) {
                if(array1[i].equals(array2[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
