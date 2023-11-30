package com.java.collections;

import java.util.LinkedList;

public class LInkedListJava {
    public static void main(String args []) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.addLast("C");
        list.addFirst("E");
        list.add(2, "E");

        System.out.println(list);
    }
}
