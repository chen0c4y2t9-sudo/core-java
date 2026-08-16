package com.itszb.demo1;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
    static void main() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1001","eric"));
        employees.add(new Employee("1002","james"));
        employees.add(new Employee("1002","james"));
        employees.add(new Employee("1004","kobe"));
        employees.add(new Employee("1001","eric"));
        System.out.println(employees);
        /**
         * 需求：将集合中的重复元素去除，将去重之后的元素放在一个新的集合中
         */
        List<Employee> new_employees = new ArrayList<>();
        for(int i = 0;i<employees.size(); i++){
            Employee employee = employees.get(i);
            if(!new_employees.contains(employee)){
                new_employees.add(employee);
            }
        }
        System.out.println("去重之后的集合:" + new_employees);
    }
}
