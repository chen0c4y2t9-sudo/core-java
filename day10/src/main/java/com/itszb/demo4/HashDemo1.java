package com.itszb.demo4;

import java.util.HashSet;
import java.util.Set;

public class HashDemo1 {
    static void main() {
        Set<String> set = new HashSet<>();
        set.add("eric");
        set.add("james");
        set.add("lily");
        set.add("curry");
        set.add("kobe");
        System.out.println("元素成功添加了吗???" + set.add("lily"));
        System.out.println(set);
    }
}
