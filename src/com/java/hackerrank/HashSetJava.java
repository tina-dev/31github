package com.java.hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetJava {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("how many items");
        int n = in.nextInt();
        in.nextLine();

        Set<String> set = new HashSet<>();
        for(int i = 0; i<n; i++) {
            System.out.println("enter name");
            String name = in.nextLine();
            set.add(name);
        }

        while (in.hasNext()) {
            System.out.println("enter name");
            String s = in.nextLine();
            int num = 0;
            if(set.contains(s)) {
                num += 1;
                System.out.println(num);
            }
            else {
                System.out.println(num);
            }
        }

    }
}
