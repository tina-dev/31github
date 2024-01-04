package com.java.algorithms.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Intro {
    public static void main(String [] args) {
        List<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b"); //O(1)
        list.add("c");

        list.remove(2); //O(1)

        list.add(0, "d"); //O(n)

        System.out.println(list.get(1));




        System.out.println(list);
    }
}
