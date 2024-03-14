package com.java.leetcode;

import java.util.LinkedList;

public class ListNodeSolution {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(2);

        System.out.println(deleteDuplicates(list));

    }

    public static LinkedList<Integer> deleteDuplicates(LinkedList<Integer> head) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i =0; i<head.size(); i++) {
            list.add(head.get(i));
        }

        for(int i = 0; i<head.size(); i++) {
            if(list.contains(head.get(i))) {
                list.remove();
            }
        }
        return list;
    }
}
