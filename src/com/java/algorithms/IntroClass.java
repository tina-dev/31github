package com.java.algorithms;

public class IntroClass {
    public static void main(String [] args) {
        String[] nemo = {"nemo"};
        findNemo(nemo);
    }


        public static void findNemo (String[] array) {
        //long start = System.currentTimeMillis();
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals("nemo")) {
                    System.out.println("Found Nemo");
                } else {
                    System.out.println("not matching");
                }
            }
            //long finish = System.currentTimeMillis();
            //System.out.println(finish - start);

        }

}
