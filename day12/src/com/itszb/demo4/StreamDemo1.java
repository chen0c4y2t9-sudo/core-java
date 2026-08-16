package com.itszb.demo4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Stream流：提高了丰富的API帮助我们对集合或者数组进行操作，可以对集合或者数组进行查找、过滤、筛选 映射等。
 * 如何使用Stream流：
 *   1. 基于集合或者数组创建Stream流
 *   2. 进行中间操作。一个中间操作由很多小的操作组成的，形成一个操作链。这个操作链可以对集合或数组进行各种处理，比如过滤 去重等。
 *   3. 进行终止操作，一旦执行终止操作，就会将中间操作的所有操作链全部执行，并产生最终的结果
 */
public class StreamDemo1 {

    public List<String> getNewNames(List<String> list, Predicate<String> predicate){
        List<String> new_names = new ArrayList<>();
        for(String name : list){
            if(predicate.test(name)){
                new_names.add(name);
            }
        }
        return new_names;
    }

    /**
     * 需求：基于集合中存储的姓名，将姓名长度等于3并且名字以王开始的姓名全部筛选出来
     */
    @Test
    public void test01(){
        List<String> names = new ArrayList<>();
        names.add("王晓红");
        names.add("王平");
        names.add("张三");
        names.add("王思聪");
        names.add("李四");

        List<String> newNames = getNewNames(names, name -> name.startsWith("王") && name.length() == 3);
        System.out.println(newNames);
    }

    // 使用Stream流的方式
    @Test
    public void test02(){
        List<String> names = new ArrayList<>();
        names.add("王晓红");
        names.add("王平");
        names.add("张三");
        names.add("王思聪");
        names.add("李四");

        // 第一种写法
       /* List<String> list = names.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return string.startsWith("王") && string.length() == 3;
            }
        }).collect(Collectors.toList());*/

        // 第二种写法
        /**
         * 创建Stream流对象 names.stream()
         * 中间操作  filter()
         * 终止操作 collect()    collect(Collectors.toList()  将中间操作的结果转换成List集合。
         */
        List<String> list = names.stream().filter(name -> name.startsWith("王") && name.length() ==3).collect(Collectors.toList());
        System.out.println(list);

        // 第三种写法
        List<String> list1 = names.stream().filter(name -> name.startsWith("王")).filter(name -> name.length() == 3).collect(Collectors.toList());
        System.out.println(list1);
    }
}
