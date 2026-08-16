package com.itszb.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * List接口中的常见方法
 *    void add(int index, E element); 在集合指定的位置上添加新元素
 *    addAll(int index,Collection c): 在集合指定的位置上新增一个新的集合进去
 *    remove(int index) 删除指定位置上的元素
 *    get(int index) 获取指定位置上的元素
 *    set(int index, E element); 替换指定位置上的元素
 *    int indexOf(Object o) 判断元素在集合中出现的位置
 *    lastIndexOf(Object o) 判断集合中元素最后出现的位置
 *    subList(int fromIndex,int toIndex) 截取一个集合获取子集合
 *    sort() 对集合中的元素进行排序
 *
 *
 * ArrayList集合存储元素的原理：
 *   特点：底层基于数组实现的，元素查找效率快，增删性能慢
 *      为什么查询数据性能高：ArrayList集合中的元素是基于Object类型的数组来存储的，元素与元素之间的内存地址是连续的，所以查询数据的效率比较快。
 *         底层数组默认的长度是10，当存储元素的时候，数组的长度不够用，ArrayList集合底层会重新创建一个新的数组，新的数组长度是原来数组长度的1.5倍。
 *         并且将原来数组中的元素拷贝到新的数组中。
 *      删除元素性能低：删除元素之后，删除之后的元素需要依次前移，保证删除之后数组中的元素之间的内存地址是连续的，而这个元素依次前移的过程性能低下。
 */
public class Demo3 {
    public static void main(String[] args) {
        // 创建一个List集合
        List<String> list = new ArrayList<>();
        list.add("eric");
        list.add("james");
        list.add("miller");
        // 在指定的索引位置上添加一个新的元素
        list.add(2,"kobe");
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("oscar");
        list1.add("lily");
        // 在集合的指定位置添加一个新的集合
        list.addAll(2,list1);
        System.out.println(list);

        // 删除指定位置上的元素并返回该元素
        String remove = list.remove(1);
        System.out.println(remove);
        System.out.println(list);
        // 获取指定索引位置上的元素
        String ele = list.get(2);
        System.out.println(ele);
        // List接口虽然提供了getFirst getLast方法，但是不能直接使用，如果要使用，建议使用Deque
        System.out.println("获取集合中的第一个元素:" + list.get(0));
        System.out.println("获取集合中的最后一个元素:" + list.get(list.size() - 1));

        // 设置集合指定位置上的元素
        list.set(2,"curry");
        System.out.println(list);

        int index = list.indexOf("kobe");
        System.out.println("指定元素在集合中第一次出现的位置是:" + index);
        list.add("curry");
        System.out.println("添加重复元素之后的集合是:" + list);
        System.out.println("元素最后出现的位置是:" + list.lastIndexOf("curry"));
        // 根据指定的区间截取一个新的集合
        List<String> list3 = list.subList(2, 4);
        System.out.println(list3);


        List<Integer> list4 = new ArrayList<>();
        list4.add(23);
        list4.add(46);
        list4.add(31);
        list4.add(67);
        list4.add(58);
        list4.sort(null);
        System.out.println(list4);
    }
}
