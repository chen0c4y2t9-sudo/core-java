package com.itszb.demo4;

/**
 * lambda表达式的格式:
 *  (参数列表) ->{
 *      函数体
 *  }
 *
 *  函数式接口：在接口中有且只能有1个抽象方法
 * @FunctionalInterface 注解  函数式接口的主键，约束我们的接口中只能有1个抽象方法
 */
@FunctionalInterface
public interface UserDao {
    public void add();
    // public void delete();
}
