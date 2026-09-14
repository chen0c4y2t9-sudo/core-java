package com.itszb.demo4;

import java.util.concurrent.Callable;

/**
 * 线程创建的方式 -- 实现Callable接口
 *   优势：
 *       在call方法中写线程的业务逻辑，还有方法的返回值，这是run方法不具备的
 *       call方法还可以通过throws关键字抛出异常
 *       call方法的返回值是泛型，意味着可以返回更加丰富的数据
 */
public class CallableThreadDemo implements Callable {

    /**
     * 需求: 输出1-100之间的偶数，并且进行求和
     * @return
     * @throws Exception
     */
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1;i<=100;i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + "输出的数字是:" + i);
                sum += i;
            }
        }
        return sum;
    }
}
