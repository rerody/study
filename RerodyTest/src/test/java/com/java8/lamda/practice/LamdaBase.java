package com.java8.lamda.practice;

import java.util.ArrayList;
import java.util.List;

public class LamdaBase {

    /**
     * 基本数据类型
     * <table>
     *     <th>
     *         <td>类型</td><td>型别</td><td>字节</td>
     *     </th>
     *     <tr><td></td><td></td><td></td></tr>
     *     <tr><td></td><td></td><td></td></tr>
     *     <tr><td></td><td></td><td></td></tr>
     *     <tr><td></td><td></td><td></td></tr>
     *     <tr><td></td><td></td><td></td></tr>
     *     <tr><td></td><td></td><td></td></tr>
     *     <tr><td></td><td></td><td></td></tr>
     *     <tr><td></td><td></td><td></td></tr>
     *     <tr><td></td><td></td><td></td></tr>
     *     <tr><td></td><td></td><td></td></tr>
     * </table>
     */
    public static void teet1() {
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
