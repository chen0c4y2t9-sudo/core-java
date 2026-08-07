package com.krisswen.demo1;

public class Student {
    private String name;
    private int age;
    private String className;
    private String address;

    public Student(String name, int age, String className, String address) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 我们以前输出一个对象，输出的是这个对象的内存地址，但是内存地址对我们来说，毫无用处，我们更希望关注的是输出的这个对象的属性和属性名称
     * 所以我们可以重写toString方法来实现
     * @return
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
