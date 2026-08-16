package com.itszb.demo4;

import java.util.*;

public class Demo1 {
    static void main() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        List list1 = Arrays.asList("orange","pear","banana","apple");
        System.out.println(list1);

        List<String> list2 = List.of("apple", "banana", "orange");
        Set<String> set = Set.of("apple", "pear", "orange");
        System.out.println(list2);
        System.out.println(set);

        Map<Integer, String> map = Map.of(1, "apple", 2, "pear", 3, "orange");
        System.out.println(map);


        List<String> list3 = List.of("A", "B", "C");
        System.out.println(list3.get(0));
        System.out.println(list3.getFirst());

        System.out.println(list3.get(list3.size() - 1));
        System.out.println(list3.getLast());

        List<String> list4 = new ArrayList<>();
        list4.addFirst("MON");
        list4.addLast("SUN");
        System.out.println(list4);
    }
}
