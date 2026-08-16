package com.itszb.demo2;


/**
 * 定义一个静态方法，专门用于员工的薪资比较
 */
public class EmpMethod {

    public int compareEmployee(Employee employee1, Employee employee2){
        return employee1.getSalary() - employee2.getSalary();
    }
}
