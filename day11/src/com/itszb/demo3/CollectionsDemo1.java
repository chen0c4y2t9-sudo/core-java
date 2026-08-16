package com.itszb.demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 集合操作的工具类Collections,常用方法如下：
 *    binarySearch() 在有序集合中，快速定位指定元素的位置(索引值)
 *    reverse() 翻转集合中的元素
 *    shuffle() 打乱集合中元素原有的顺序
 *    fill() 将一个集合中的所有元素进行覆盖
 *    swap() 将集合中两个位置上的元素进行位置交换
 *    min() 找到集合中最小元素
 *    max() 找到集合中最大元素
 */
public class CollectionsDemo1 {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        // 返回指定元素的索引值
        int index = Collections.binarySearch(list, 13);
        System.out.println("指定元素在集合中的索引位置是:" + index);

        Collections.reverse(list);
        System.out.println("反转集合之后的元素是:" + list);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("苹果",15));
        productList.add(new Product("西瓜",5));
        productList.add(new Product("草莓",35));
        productList.add(new Product("蓝莓",55));
        int index1 = Collections.binarySearch(productList, new Product("草莓", 35));
        System.out.println(index1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list2.add(16);
        Collections.shuffle(list2);
        System.out.println("打乱之后的集合的元素是:" + list2);

        List<Product> productList2 = new ArrayList<>();
        productList2.add(new Product("苹果",15));
        productList2.add(new Product("西瓜",5));
        productList2.add(new Product("草莓",35));
        productList2.add(new Product("蓝莓",55));
        //Collections.swap(productList2,0,3);
        //System.out.println("交换元素位置之后的集合是:" + productList2);

        // 将集合中的所有元素覆盖成指定的元素
        List<Product> productList3 = new ArrayList<>();
        productList3.add(new Product("苹果",15));
        productList3.add(new Product("西瓜",5));
        productList3.add(new Product("草莓",35));
        productList3.add(new Product("蓝莓",55));
        Collections.fill(productList3,new Product("樱桃",55));
        System.out.println(productList3);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(productList2));
        System.out.println(Collections.max(productList2));
    }

}
