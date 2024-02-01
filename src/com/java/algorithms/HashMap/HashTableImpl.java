package com.java.algorithms.HashMap;

import java.sql.Array;
import java.util.ArrayList;

public class HashTableImpl {
    ArrayList<Integer> data;
    public HashTableImpl(int size) {
        this.data = new ArrayList<Integer>(size);
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }
}
