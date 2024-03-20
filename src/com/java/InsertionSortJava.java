package com.java;

public class InsertionSortJava {
    public static void main(String args []) {
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSortJava ob = new InsertionSortJava();
        ob.sort(arr);
        printArray(arr);
    }

    static void printArray(int arr []) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void sort(int arr []) {

        int n = arr.length;
        for(int i = 1; i<n; i++) {
            int key = arr[i];
            int j = i -1;

            while(j >=0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }


}
