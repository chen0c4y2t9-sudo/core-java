package com.krisswen.demo4;

/**
 *  如果一个子类继承了密封类，对于子类的类型，必须要描述清楚。子类的类型可以如下：
 *           final: 任何类不能再继承当前类（B）,到目前为止，已经封死了。
 *           sealed: 同父类类型是一样的
 *           non-sealed: 开发的，允许任何类继承
 *  non-sealed:
 */
public sealed class B extends A permits C{
}
