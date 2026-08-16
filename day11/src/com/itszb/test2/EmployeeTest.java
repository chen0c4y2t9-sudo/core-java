package com.itszb.test2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeTest {
    static void main() {
        // 创建一个TreeMap存储员工信息
        TreeMap<Employee,String> empMap = new TreeMap<>((o1,o2)->o1.getSalary() - o2.getSalary());
        // 添加员工信息
        empMap.put(new Employee(1001,"张三",8000),"技术部");
        empMap.put(new Employee(1002,"李四",12000),"财务部");
        empMap.put(new Employee(1003,"王五",9500),"技术部");
        empMap.put(new Employee(1004,"马六",7000),"人事部");
        // 获取工资最高的员工
        Map.Entry<Employee, String> maxSalEmp = empMap.firstEntry();
        // 获取工资最低的员工
        Map.Entry<Employee, String> minSalEmp = empMap.lastEntry();
        System.out.println("工资最高的员工:"+ maxSalEmp.getKey() + "，所属的部门是：" + maxSalEmp.getValue());
        System.out.println("工资最低的员工:"+ minSalEmp.getKey() + "，所属的部门是：" + minSalEmp.getValue());
        // 遍历所有员工
        for (Map.Entry<Employee, String> entry : empMap.entrySet()) {
            System.out.println(entry.getKey() + "，所属部门是:" + entry.getValue());
        }

    }
}
