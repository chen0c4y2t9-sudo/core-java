package com.itszb.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * Map集合描述元素之间的映射关系
 * Map 双列集合的接口
 *     HashMap 实现类
 *     HashTable 实现类
 *     TreeMap 实现类
 *
 * HashMap底层的数据结构是数组 + 链表 + 红黑树(1.8及以上的版本)；在1.8版本之前，数据结构是数组 + 链表
 *
 * Map集合中常见方法：
 * V put(K key, V value); 在Map集合中添加一个元素
 * putAll(Map<? extends K, ? extends V> m);在一个Map集合中添加另一个Map集合
 *
 * clear() 清空集合中的元素
 * remove(Object key) 根据key移除集合中的元素
 * values() 获取Map集合中的所有value值的集合
 * keySet() 获取Map集合中所有key的集合
 * entrySet(); 遍历map集合中的所有元素
 * size() 获取集合中的元素个数
 *
 * containsKey(Object key);判断是否包含某个键
 * containsValue(Object value); 判断集合中是否包含指定的值
 * equals 判断集合中的元素是否一样
 */
public class MapDemo1 {
    static void main(String[] args) {
        /**
         * 创建了一个HashMap集合对象，使用空参构造一个HashMap对象，实际上给底层的数组的加载因子是0.75.
         * 加载因子：HashMap底层数组存储的元素个数达到了当前数组的75%,数组就要扩容。
         * 数组的初始长度是:DEFAULT_INITIAL_CAPACITY = 1 << 4; 默认是16，底层的数组默认是Node类型，
         * 在创建HashMap对象的时候，并没有初始化Node类型的数组，而是在第一次调用put方法的时候才初始化的。
         */
        Map<String,String> map = new HashMap();
        map.put("1001","eric");
        map.put("1002","james");
        map.put("1003","miller");
        map.put("1004","kobe");
        //map.put(null,"kobe");  在HashMap中是可以使用空值来作为键的，但是一般不这么使用。
        System.out.println(map);
    }
}
