package com.java.algorithms.Stack;

import java.util.Stack;

//LIFO
//pop -remove last item
//push - add item
//peek - view most top item

public class StackImpl {
    public static void main(String [] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());

        for(int i: stack) {
            System.out.println(i);
        }

    }
}
