package com.itszb.demo4;

/**
 * 带参数的lambda表达式的写法
 * (参数列表)->{
 *     函数体
 *     return 结构
 * }
 */
@FunctionalInterface
public interface OrderDao {
    public int getPrice(int amount);
}
