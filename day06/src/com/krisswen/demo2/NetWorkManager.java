package com.krisswen.demo2;
/**
 * 网络维护部门的员工
 */
public class NetWorkManager extends Mainter {

    public NetWorkManager(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工编号为:" + this.id + "的" + this.name + "的员工正在进行网络维护");
    }
}
