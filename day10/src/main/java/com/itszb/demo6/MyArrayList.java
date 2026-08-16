package com.itszb.demo6;

/**
 * 泛型类<E或者T>
 *
 * 泛型方法的定义格式:
 *   访问修饰符  泛型标识  方法名称(参数类型 变量名){
 *
 *   }
 * @param <T>
 */
public class MyArrayList<T>{
    // 创建一个默认数据，数组长度为10
    Object[] obj = new Object[10];
    // 定义一个指针，默认为0
    int size;

    // 定义一个元素添加的方法
    public <T> boolean add(T t){
        obj[size] = t;
        size ++;
        return true;
    }

    // 定义一个获取元素的方法
    public T get(int index){
        return (T)obj[index];
    }
}
