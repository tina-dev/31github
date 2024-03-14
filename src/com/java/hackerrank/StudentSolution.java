package com.java.hackerrank;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentSolution {
    public static void main(String[] args) throws ClassNotFoundException {
        Class student = Class.forName("com.java.hackerrank.Students");

        Method [] methods  = student.getClass().getMethods();
        List<Method> list = Arrays.asList(methods);

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method: list) {
            methodList.add(method.getName());
        }

        Collections.sort(methodList);
        for(String name: methodList) {
            System.out.println(name);
        }




    }
}
