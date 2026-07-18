package com.krisswen.demo2;

/**
 * 员工类
 */
public abstract class Employee {
    public int id;
    public String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 定义一个工作的方法
    public abstract void work();
}
