package com.krisswen.demo4;

/**
 * 在class关键字前面加上一个sealed，表示此类为密封类
 * permits 允许后面跟上的基础类型，如果有多个子类继承，可以使用,分割。
 *
 */
public sealed class A permits B{
}
