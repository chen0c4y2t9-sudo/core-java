package com.itszb.demo2;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 使用TreeMap可以对元素进行排序，默认是基于key来进行排序的，如果key值具备自然顺序，那么默认就会按照key的自然顺序来输出。如果key不具备自然顺序，
 *  在输出的时候会报类型转换异常(ClassCastException),此时需要基于key类自定义比较规则。
 *
 *  TreeMap中常见的方法:
 *     ceilingEntry(E e) 返回一个键值的映射关系，它与大于等于给定键的最小键关联，如果不存在这样的键，则返回为null
 *     firstEntry() 返回最小键值
 *     lastEntry() 返回最大的键值
 */
public class TreeMapDemo1 {
    static void main() {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(40,"abc4");
        treeMap.put(10,"abc1");
        treeMap.put(20,"abc2");
        treeMap.put(30,"abc3");
        System.out.println(treeMap);
        // 返回大于等于给的键的最小键值
        Map.Entry<Integer, String> entry = treeMap.ceilingEntry(11);
        System.out.println(entry);

        Map.Entry<Integer, String> entry1 = treeMap.firstEntry();
        System.out.println(entry1);

        Map.Entry<Integer, String> entry2 = treeMap.lastEntry();
        System.out.println(entry2);

        SortedMap<Integer, String> subMap = treeMap.subMap(10, 30);// [10,30)
        System.out.println(subMap);
    }
}
