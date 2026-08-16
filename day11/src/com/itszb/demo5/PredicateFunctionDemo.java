package com.itszb.demo5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 断言型函数式接口的实现
 *
 * boolean test(T t) 判断传递的参数t是否满足指定的约束或者规范，如果满足则返回true，如果不满足则返回false
 */
public class PredicateFunctionDemo {
    // 将一个List集合的元素进行过滤，过滤出来的元素放在一个新的集合中
    public List<String> filterList(List<String> list, Predicate<String> pre){
        ArrayList<String> new_list = new ArrayList<>();
        for(String str: list){
            if(pre.test(str)){
                new_list.add(str);
            }
        }
        return new_list;
    }

    // 以前的写法
    @Test
    public void test01(){
        List<String> list = new ArrayList<>();
        list.add("北京");
        list.add("南京");
        list.add("东京");
        list.add("天津");
        List<String> newList = filterList(list, new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return string.contains("京");
            }
        });
        System.out.println(newList);
    }

    @Test
    public void test02(){
        List<String> list = new ArrayList<>();
        list.add("北京");
        list.add("南京");
        list.add("东京");
        list.add("天津");
        List<String> newList = filterList(list, s -> s.contains("京"));
        System.out.println(newList);
    }
}
