package com.java.collections;

import java.util.LinkedList;
import java.util.Scanner;

public class JavaListChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print queries: ");
        int n = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(0);
        list.add(1);
        list.add(78);
        list.add(12);

        System.out.println("type what you want");

        String insert = scanner.next();

        if(insert.equals("Insert")) {
            list.add(5, 23);
        }
        else {
            list.remove(0);
        }
        System.out.println(list);

    }
}
