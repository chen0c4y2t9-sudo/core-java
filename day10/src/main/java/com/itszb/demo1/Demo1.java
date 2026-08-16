package com.itszb.demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 集合用于存储一批元素，功能和数组相似，当然集合和数组也有不同的地方
 *  相同：都是容器，都能够存储一批数据
 *  不同：
 *      数组的大小是固定的，一旦声明长度就不能再次更改；但是集合的大小不是固定的，长度可变。
 *      数组可以存储基本数据类型，但是集合只能存储对象(引用数据类型的数据)
 *      数组存放的数据类型只有一种，但是集合可以存储不同种类的元素
 *
 * 集合的体系结构(单列集合)：
 *    根接口 Collection
 *          List 子接口 间接的继承了Collection  有序可重复
 *               ArrayList 实现类
 *               LinkedList 实现类
 *          Set 子接口  直接继承了Collection  无序不重复
 *               HashSet  实现类
 *               TreeSet  实现类
 *
 * Collection接口中的方法
 *    add(E e) 将指定的元素添加到集合中
 *    addAll 将一个集合中的元素添加到另一个集合中
 *    remove(Object o) 移除集合中的指定元素
 *    clear() 将集合中的所有元素清空
 *    isEmpty() 判断集合的内容是否为空
 *    contains() 判断集合中是否包含指定的元素
 *    containsAll() 判断一个集合中是否包含另一个完整的集合
 *    toArray() 将集合转换成数组
 *    size() 获取集合中元素的个数
 */
public class Demo1 {
    public static void main(String[] args) {
        // 创建一个Collection集合
        Collection<Integer> col = new ArrayList<>();
        // add 添加一个元素到集合中
        col.add(23);
        col.add(24);
        col.add(59);

        Collection<Integer> col1 = new ArrayList<>();
        col1.add(34);
        col1.add(67);
        // 将col1集合中的元素放在col中
        col.addAll(col1);
        System.out.println(col);
        // 移除指定的元素
        col.remove(34);
        System.out.println("移除元素之后的集合:" + col);
        // 清空集合中的元素
        col.clear();
        System.out.println("清空集合之后:" + col);
        // isEmpty 判断集合中的元素是否为空
        System.out.println(col1.isEmpty());
        System.out.println(col.isEmpty());

        // 判断一个集合中的元素是否存在
        System.out.println(col1.contains(122));

        Collection<Integer> col2 = new ArrayList<>();
        col2.add(34);
        col2.add(67);
        col2.add(78);
        col2.add(98);
        // 判断一个集合中是否包含另外一个集合的所有元素
        System.out.println(col2.containsAll(col1));
        // 将一个集合转换成数组
        Object[] array = col2.toArray();
        for(Object o : array){
            System.out.print(o + "\t");
        }
        System.out.println();
        // 获取一个集合中的元素个数
        System.out.println("集合中元素的个数是:" + col2.size());
        col.add(13);
        col.add(13);
        col.add(13);
        System.out.println(col);
    }
}
