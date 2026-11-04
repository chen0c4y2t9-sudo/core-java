package com.itszb.demo2;

/**
 * 基于方法同步，实现懒加载的单例设计模式
 *    优势: 实现了单例对象的按需创建，并且获取 创建单例对象的过程是线程安全的。但是性能很差。
 */
public class LazySyncSingleton {
    private String name;
    private String color;

    private LazySyncSingleton(String name, String color) {
        this.name = name;
        this.color = color;
    }

    private static LazySyncSingleton instance = null;

    /**
     * 使用synchronized性能很差，因为CPU要进行加锁和释放锁的指令操作,非常耗费CPU的性能
     * @return
     */
    public static synchronized LazySyncSingleton getInstance() {
        if (instance == null) {
            instance = new LazySyncSingleton("大黄","黄色");
        }
        return instance;
    }
}
