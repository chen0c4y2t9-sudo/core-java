package com.krisswen.demo2;

/**
 * java开发部门的员工
 */
public class JavaEEDeveloper extends Developer{

    public JavaEEDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工编号为:" + this.id + "的" + this.name + "的员工正在开发后台系统");
    }
}
