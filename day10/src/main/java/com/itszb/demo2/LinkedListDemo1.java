package com.itszb.demo2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList集合的特点：
 *     由于链表节点内部的地址是不连续的，所以在遍历元素的时候，由于元素内存地址不连续，增加元素查找的时间，所以检索的效率很低。但是增删的效率高，
 *     在进行元素的新增或者删除的时候，我们只要改变元素的指针指向就可以了。
 * LinkedList集合中的常见方法
 *   getFirst() 获取集合中的第一个元素
 *   getLast() 获取集合中的最后一个元素
 *   addFirst() 在集合头部进行元素的添加
 *   addLast() 在集合的尾部进行元素的添加
 *
 *    removeFirst() 删除集合中的头部元素
 *    removeLast() 删除集合中的最后一个元素
 *
 */
public class LinkedListDemo1 {
    static void main() {
        // 创建一个空的LinkedList集合
        List<String> list = new LinkedList<>();
        list.add("eric");
        list.add("james");
        list.add("lily");
        list.add("eric");
        System.out.println(list);

        List list1 = new ArrayList();
        list1.add("java");
        list1.add("hadoop");
        list1.add("mysql");
        // 将ArrayList集合转换成LinkedList集合
        List<String> list2 = new LinkedList<>(list1);
        System.out.println(list2);

        LinkedList<String> list3 = new LinkedList<>();
        list3.add("eric");
        list3.add("james");
        list3.add("lily");
        // 获取集合中的第一个元素
        System.out.println(list3.getFirst());
        // 获取集合中的最后一个元素
        System.out.println(list3.getLast());
        // 在集合首位进行元素的添加
        list3.addFirst("lucy");
        list3.addLast("pink");
        System.out.println(list3);

        // 删除集合中头部元素，并返回
        System.out.println(list3.removeFirst());
        System.out.println("删除头部元素之后的集合是:" + list3);
        // 删除最后一个元素并返回
        System.out.println(list3.removeLast());
        System.out.println("删除最后一个元素之后的集合是:" + list3);

        LinkedList<String> list4= new LinkedList<>();
        list4.add("eric");
        list4.add("james");
        list4.add("lily");
        list4.add("eric");
        list4.add("curry");
        // 删除列表的头部元素
        //String poll = list4.poll();
        //System.out.println(poll);

        // 删除栈顶元素并返回
//        String pop = list4.pop();
//        System.out.println(pop);

        // 返回栈顶元素，但是不删除
        //String peek = list4.peek();
        //System.out.println(peek);
        list4.offer("sunny");
        System.out.println(list4);
    }
}
