package com.krisswen.demo2;

/**
 * 硬件维护工程师类
 */
public class HardwareManager extends Mainter{

    public HardwareManager(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工编号为:" + this.id + "的" + this.name + "的员工正在修复硬件");
    }
}
