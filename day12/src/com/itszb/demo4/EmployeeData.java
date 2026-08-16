package com.itszb.demo4;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1001,"eric",21,2100));
        list.add(new Employee(1002,"james",22,3210));
        list.add(new Employee(1003,"kobe",22,3050));
        list.add(new Employee(1004,"miller",22,4200));
        list.add(new Employee(1005,"oscar",24,6100));
        list.add(new Employee(1006,"lucy",26,5500));
        return list;
    }
}
