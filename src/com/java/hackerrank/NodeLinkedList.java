package com.java.hackerrank;

import java.util.LinkedList;

public class NodeLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);

        System.out.println(linkedList);

        System.out.println(insertNode(linkedList, 8, 1));

    }

    public static LinkedList insertNode(LinkedList list, int data, int position) {
        for(int i = 0; i<list.size(); i++) {
            list.add(position, data);
        }
        return list;
    }
}
