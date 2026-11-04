package com.itszb.demo2;

/**
 * 双重检查锁单例设计模式: 实现了对象创建是按需创建的，并且创建对象的过程是线程安全的。
 */
public class DoubleCheckLockSingleton {
    private String name;
    private String color;

    private DoubleCheckLockSingleton(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // 保证线程之间的可见性，一旦一个线程创建单例对象出来之后，其他线程都能感知到对象从创建，不会进行重复创建。
    private volatile static DoubleCheckLockSingleton instance = null;

    public static DoubleCheckLockSingleton getInstance() {
        /**
         * 第一重检查:
         *    如果对象已经被创建出来了，通过第一重判断，可以避免进入到同步代码块里面来，因为进来了没有任何意义，啥也没干就出来了。
         *    并且，进入到同步代码块，性能较低。 所以通过第一重判断可以保证程序的执行性能。
         */
        if (instance == null) {
            // t1 t2
            synchronized (DoubleCheckLockSingleton.class) {
                /**
                 * 第二重检查：
                 *   多个线程都是第一次调用getInstance方法进行单例对象的获取，假设此时对象还没有创建，线程1 线程2可能都经过第一重判断，
                 *   来到synchronized同步代码块的外面。如果线程2率先抢占到锁对象，进入到同步代码块里面进行对象的创建。后续线程1进入到
                 *   同步代码块里面，通过第二重判断，可以避免对象的重复创建。
                 */
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton("大黄","黄色");
                }
            }
        }
        return instance;
    }
}
