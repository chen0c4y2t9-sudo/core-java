package com.itszb.demo1;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("eric",23));
        list.add(new Student("james",98));
        list.add(new Student("lily",76));
        list.add(new Student("miller",55));
        /**
         * 在使用sort方法进行排序的时候，如果元素本身具备自然属性，比如数字或者字母，此时可以不用指定比较器
         * 但是如果我们的元素的对象，在比较的时候需要指定比较规则，此时必须要排序，否则会报错。
         */
        list.sort(new MyComparator());
        System.out.println(list);
    }
}
