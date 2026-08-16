package com.itszb.demo4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 关于HashSet集合存储元素的原理
 *   往HashSet集合里面添加元素的时候，首先会调用元素的HashCode方法，获取元素的哈希码值，然后会根据这个HashCode值经过一系列的移位运算，
 *   算出元素在哈希表中的位置。如果该位置上没有其他元素存储，那么就直接添加该元素。如果该位置上已经存储了其他的元素，那么就会立即调用该元素
 *   所属类的equals方法再比较一次。如果equals方法返回值为true，则为重复元素，不允许添加；如果该方法的返回值为false，则允许添加该元素。
 */
public class HashDemo3 {
    static void main() {
        Set<Person> set = new HashSet<>();
        set.add(new Person("eric","1001"));
        set.add(new Person("james","1002"));
        set.add(new Person("lily","1003"));
        set.add(new Person("lucy","1004"));
        set.add(new Person("lucy","1004"));
        Iterator<Person> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
