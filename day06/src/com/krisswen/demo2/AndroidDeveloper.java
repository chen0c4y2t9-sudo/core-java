package com.krisswen.demo2;

/**
 * 安卓部门的员工类
 */
public class AndroidDeveloper extends Developer{
    public AndroidDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工编号为:" + this.id + "的" + this.name + "的员工正在开发安卓app");
    }
}
