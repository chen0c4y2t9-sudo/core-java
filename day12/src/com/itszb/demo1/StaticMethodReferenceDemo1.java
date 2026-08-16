package com.itszb.demo1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 静态方法的引用
 */
public class StaticMethodReferenceDemo1 {

    @Test
    public void test01(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int compare = comparator.compare(12, 23);
        System.out.println(compare);
    }

    @Test
    public void test02(){
        Comparator<Integer> comparator = (o1,o2)->Integer.compare(o1,o2);
        int compare = comparator.compare(13, 23);
        System.out.println(compare);
    }

    @Test
    public void test03(){
        Comparator<Integer> comparator = Integer::compare;
        int compare = comparator.compare(24, 12);
        System.out.println(compare);
    }

    @Test
    public void test04(){
        Employee employee1 = new Employee(1001,"eric",23,2000);
        Employee employee2 = new Employee(1002,"james",28,1550);
        Employee employee3 = new Employee(1003,"lily",25,2340);
        Employee employee4 = new Employee(1004,"sunny",21,4200);
        Employee employee5 = new Employee(1005,"miller",26,3500);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getSalary() - o1.getSalary();
            }
        });
        // 输出排序后的数组
        System.out.println(Arrays.toString(employees));
    }

    @Test
    public void test05(){
        Employee employee1 = new Employee(1001,"eric",23,2000);
        Employee employee2 = new Employee(1002,"james",28,1550);
        Employee employee3 = new Employee(1003,"lily",25,2340);
        Employee employee4 = new Employee(1004,"sunny",21,4200);
        Employee employee5 = new Employee(1005,"miller",26,3500);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};
        Arrays.sort(employees,(o1,o2)->o2.getSalary() - o1.getSalary());
        // 输出排序之后的结果
        System.out.println(Arrays.toString(employees));
    }

    @Test
    public void test06(){
        Employee employee1 = new Employee(1001,"eric",23,2000);
        Employee employee2 = new Employee(1002,"james",28,1550);
        Employee employee3 = new Employee(1003,"lily",25,2340);
        Employee employee4 = new Employee(1004,"sunny",21,4200);
        Employee employee5 = new Employee(1005,"miller",26,3500);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};
        Arrays.sort(employees,EmployeeMethod::compareEmployee);
        // 输出排序之后的结果
        System.out.println(Arrays.toString(employees));
    }
}
