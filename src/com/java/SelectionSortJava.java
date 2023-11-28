package com.java;

public class SelectionSortJava {
    public static void main(String args[]) {
        SelectionSortJava ob = new SelectionSortJava();
        int arr [] = { 64, 25, 12, 22, 11 };
        ob.sort(arr);
        ob.printArray(arr);

    }

     void sort(int arr[]) {

        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }




}
