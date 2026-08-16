package com.itszb.demo4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * Stream流的终止操作
 */
public class StreamDemo3 {

    /**
     * Stream流中的中止方法：
     *   allMatch() 集合中的所有元素必须全部匹配指定的规则返回true
     *   anyMatch() 集合中任意一个元素匹配匹配指定规则就返回true
     *   noneMatch() 集合中的元素没有匹配指定规则，就返回true
     *   findFirst() 获取集合中的第一个元素
     *   findAny() 获取满足指定条件之后的第一个元素
     *   count() 计数统计
     *   max() 获取最大元素，如果是非自然元素，需要定义比较规则
     *   reduce() 进行求和计算
     */
    @Test
    public void test01(){
        List<Employee> employeeList = EmployeeData.getEmployees();
        // 判断一个集合每个元素的年龄是否大于25，如果是返回true，否则返回false
        boolean flag = employeeList.stream().allMatch(e -> e.getAge() > 25);
        System.out.println(flag);

        // 判断集合中是否存在任意一个元素，工资大于5000
        boolean result = employeeList.stream().anyMatch(e -> e.getSalary() > 5000);
        System.out.println(result);

        // 判断集合中是否存在任意一个元素，薪资没有达到8000，如果有则返回false
        boolean result1 = employeeList.stream().noneMatch(e -> e.getSalary() > 8000);
        System.out.println(result1);

        // 获取集合中的第一个元素
        Optional<Employee> optional = employeeList.stream().findFirst();
        System.out.println(optional.get());
        System.out.println("--------");

        // 按照元素新增的顺序，获取满足指定条件之后的第一个元素
        Employee emp = employeeList.stream().filter(e ->e.getSalary() > 4000).findAny().get();
        System.out.println(emp);

        // 查询员工总数
        long count = employeeList.stream().count();
        System.out.println("员工总数是:" + count);

        // 查询薪资大于等于4000的员工个数
        long count1 = employeeList.stream().filter(e -> e.getSalary() >= 4000).count();
        System.out.println("薪资大于等于4000的员工个数是:" + count1);

        // 找出集合中薪资最高的薪水
        Integer max = employeeList.stream().map(s -> s.getSalary()).max((a, b) -> a - b).get();
        System.out.println("最高的薪资是:" + max);

        Integer max1 = employeeList.stream().map(s -> s.getSalary()).max((a, b) -> Integer.compare(a,b)).get();
        System.out.println("最高的薪资是:" + max1);

        Integer max2 = employeeList.stream().map(s -> s.getSalary()).max(Integer::compare).get();
        System.out.println("最高的薪资是:" + max2);
    }

    @Test
    public void test02(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // 计算集合中的元素之和
        Integer num = list.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
        System.out.println("方式1:" + num);

        Integer num1 = list.stream().reduce(0,((integer, integer1) -> integer + integer1));
        System.out.println("方式2:" + num1);

        Integer sum2 = list.stream().reduce(0,((integer, integer2) -> Integer.sum(integer,integer2)));
        System.out.println("方式3:" + sum2);

        Integer num3 = list.stream().reduce(0,Integer::sum);
        System.out.println("方式4:" + num3);

        //  获取集合中薪资的总和
        Integer total = EmployeeData.getEmployees().stream().map(emp -> emp.getSalary()).reduce(0,Integer::sum);
        System.out.println("总薪资是:" + total);
    }

    @Test
    public void test04(){
        List<Employee> collect = EmployeeData.getEmployees().stream().filter(e -> e.getSalary() > 4500).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
