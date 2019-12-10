package com.java8.lamda.practice;

import java.util.ArrayList;
import java.util.List;

public class LamdaBase {

    public static void teet1(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // 可改变对象
        list.stream().map((i) -> i * 3).forEach(System.out::println);

        // 不可改变元有对象
//        list.forEach(i -> i = i * 3);
        list.forEach(System.out::println);
    }
}
