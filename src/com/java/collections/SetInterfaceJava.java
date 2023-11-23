package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceJava {
    public static void main(String [] args) {

        Set<String> hs = new HashSet<String>();

        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("B");

        System.out.println(hs);

        String check = "D";

        System.out.println("Contains " + check + " " + hs.contains(check));

    }
}
