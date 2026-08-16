package com.itszb.demo2;

import com.itszb.demo1.EmployeeMethod;
import com.itszb.demo2.Employee;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceDemo1 {

    @Test
    public void test01(){
        UserMethod userMethod = new UserMethod();
        UserDao userDao = new UserDao() {
            @Override
            public String save(String str1, String str2) {
              return userMethod.generateStr(str1,str2);
            }
        };

        String string = userDao.save("hello", ",java");
        System.out.println(string);
    }

    @Test
    public void test02(){
        UserMethod userMethod = new UserMethod();
        UserDao userDao = (str1,str2) -> userMethod.generateStr(str1,str2);
        String string = userDao.save("hello", ",java");
        System.out.println(string);
    }

    @Test
    public void test03(){
        UserMethod userMethod = new UserMethod();
        UserDao userDao = userMethod::generateStr;
        System.out.println(userDao.save("hello",",springCloud"));
    }

    @Test
    public void test04(){
        Employee employee1 = new Employee(1001,"eric",23,2000);
        Employee employee2 = new Employee(1002,"james",28,1550);
        Employee employee3 = new Employee(1003,"lily",25,2340);
        Employee employee4 = new Employee(1004,"sunny",21,4200);
        Employee employee5 = new Employee(1005,"miller",26,3500);

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        list.forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee);
            }
        });
    }

    @Test
    public void test05(){
        Employee employee1 = new Employee(1001,"eric",23,2000);
        Employee employee2 = new Employee(1002,"james",28,1550);
        Employee employee3 = new Employee(1003,"lily",25,2340);
        Employee employee4 = new Employee(1004,"sunny",21,4200);
        Employee employee5 = new Employee(1005,"miller",26,3500);

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        //list.forEach(e-> System.out.println(e));
        list.forEach(System.out::println);
    }

    @Test
    public void test06(){
        Employee employee1 = new Employee(1001,"eric",23,2000);
        Employee employee2 = new Employee(1002,"james",28,1550);
        Employee employee3 = new Employee(1003,"lily",25,2340);
        Employee employee4 = new Employee(1004,"sunny",21,4200);
        Employee employee5 = new Employee(1005,"miller",26,3500);
        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};
        EmpMethod empMethod = new EmpMethod();
        //Arrays.sort(employees,(o1,o2)->empMethod.compareEmployee(o1,o2));
        Arrays.sort(employees,empMethod::compareEmployee);
        System.out.println(Arrays.toString(employees));
    }
}
