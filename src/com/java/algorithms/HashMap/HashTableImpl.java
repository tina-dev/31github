package com.java.algorithms.HashMap;

import java.util.ArrayList;

public class HashTableImpl {
    public ArrayList<String> name;
    public ArrayList<Integer> prices;



    public HashTableImpl(int size) {
        this.name = new ArrayList<String>(size);
        this.prices = new ArrayList<Integer>(size);
    }

    public int getData(String fruit) {
        int index = name.indexOf(fruit);
        return prices.get(index);
    }

    public void setData(String fruit, int price) {
        name.add(fruit);
        prices.add(price);
    }
}
