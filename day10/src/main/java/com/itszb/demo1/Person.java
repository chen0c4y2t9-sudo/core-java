package com.itszb.demo1;

public class Person {
    String name;
    String id;
    public Person(){}

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // 重写两个对象的比较规则
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person person){
            // 如果两个人的身份证id和姓名是一样的，说明这两个人是同一个对象
            return this.id.equals(person.id) && this.name.equals(person.name);
        }
        return false;
    }

    // 重写toString方法，定义对象输出的格式
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
