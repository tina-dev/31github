package com.java.hackerrank;

import java.util.*;

public class ListChallenge {
    public static void main(String [] args) {

        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);





        Scanner scanner = new Scanner(System.in);



        System.out.println("What do you want to do?");

        String s = scanner.nextLine();



        if(s.equals("Insert")) {
            System.out.println("which location?");
            int index = scanner.nextInt();
            System.out.println("element num?");
            int element = scanner.nextInt();
            nums.add(index, element);

        }
        if(s.equals("Delete")) {
            System.out.println("which location? ");
            int el = scanner.nextInt();
            nums.remove(el);
        }


        System.out.println(nums);

    }
}
