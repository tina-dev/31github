package com.java;

import java.util.Scanner;

public class ArraysBasic {
    public static void main(String [] args) {
        int [] nums = new int[5];
        nums[0] = 45;
        nums[1] = 40;
        nums[2] = 4;
        nums[3] = 3;
        nums[4] = 10;
        int res = nums[0] + nums[4];

        System.out.println(res);

        float [] nums2 = new float[] {5.0f, 5.3f, 89.5f};

        for(int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);

        }

        int [] arr = new int[4];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter number: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }

        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimal: " + min);
    }
}
