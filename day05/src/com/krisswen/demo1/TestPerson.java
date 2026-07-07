// package包的关键字， 格式： page 包的路径
package com.krisswen.demo1;

// import关键字  如果我们在当前类里面需要引用一个外部包的来，需要使用import关键字来进行导入。
// 格式: import 包名 + 类名

// 如果一个类位于java.lang包里面，是不用使用import关键字进行包的导入的。
// import java.lang.System;

// 静态导入
// import static com.krisswen.pojo.Person.test;

import com.krisswen.pojo.Person;

public class TestPerson {
    static void main(String[] args) {
        Person person = new Person();
       /* person.name = "eric";
        person.age = 12;
        System.out.println(person.name);
        System.out.println(person.age);*/

        // Person.test();
        //test();

        // 当我们的成员属性被封装好了之后，给属性赋值，需要使用set方法来完成
        person.setName("eric");
        person.setAge(194343);
        person.setSex("男");

        // 输出属性
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getSex());
    }
}
