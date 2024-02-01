package com.java.algorithms.HashMap;

public class HashTableMain {
    public static void main(String [] args) {
        HashTableImpl impl = new HashTableImpl(5);
        impl.setData("apple", 10);
        impl.setData("pineapple", 200);
        impl.setData("watermelon", 300);

        System.out.println(impl.getData("pineapple"));
    }

}
