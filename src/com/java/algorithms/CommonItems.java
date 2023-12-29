package com.java.algorithms;

import java.util.HashMap;
import java.util.Map;

public class CommonItems {
    public static void main(String [] args) {
        String [] arr = {"a", "b", "c"};
        String [] arr2 = {"a", "d", "e"};
        System.out.println(itemsContains(arr, arr2));
        System.out.println(findCommonElement(arr, arr2));

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

    public static boolean findCommonElement(String [] arr1, String [] arr2) {
        if (arr1 != null && arr2 != null) {
            Map<String, Boolean> arrayMap = new HashMap<>();
            for (String i : arr1) {
                arrayMap.put(i, true);
            }
            for (String j : arr2) {
                if (arrayMap.get(j) != null && arrayMap.get(j).equals(true)) {
                    return true;
                }
            }
        }
        return false;
    }


}
