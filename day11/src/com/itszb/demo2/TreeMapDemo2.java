package com.itszb.demo2;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {
    static void main() {
        TreeMap<Cat,String> treeMap = new TreeMap<>();
        treeMap.put(new Cat("eric",3),"田园猫");
        treeMap.put(new Cat("flower",3),"橘猫");
        treeMap.put(new Cat("apple",3),"加菲猫");
        treeMap.put(new Cat("pear",3),"布偶猫");
        //Map.Entry<Cat, String> entry = treeMap.ceilingEntry(new Cat("apple", 2));
        //System.out.println(entry);

//        Map.Entry<Cat, String> firstEntry = treeMap.firstEntry();
//        System.out.println(firstEntry);
    }
}
