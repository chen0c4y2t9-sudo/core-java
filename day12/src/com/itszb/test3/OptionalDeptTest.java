package com.itszb.test3;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalDeptTest {

    // 获取部门经理姓名
    public static String getManagerName(Dept dept){
        return Optional.ofNullable(dept)// 处理部门为null
                .map(Dept::getManager)// 提取经理，经理为null，则后续走orElse
                .map(Employee::getEmpName) // 提取经理姓名，姓名为空，则走orElse
                .orElse("未知姓名"); // 姓名为null的默认值
    }

    @Test
    public void test01(){
        // 场景1：部门为null
        System.out.println("场景1:" + getManagerName(null));
        // 场景2：部门非null，经理为null
        Dept dept = new Dept("研发部",null);
        System.out.println("场景2:" + getManagerName(dept));
        // 场景3：部门和经理非null，经理姓名为null
       Employee employee = new Employee(null,35);
       Dept dept1 = new Dept("市场部",employee);
        System.out.println("场景3:" + getManagerName(dept1));

        // 场景4：所有信息都不为null
        Employee employee1 = new Employee("eric",34);
        Dept dept2 = new Dept("技术部",employee1);
        System.out.println("场景4:" + getManagerName(dept2));
    }
}
