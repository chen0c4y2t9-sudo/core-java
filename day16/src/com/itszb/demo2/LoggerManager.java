package com.itszb.demo2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 基于单例设计模式实现全局日志管理器
 */
public class LoggerManager {
    private static volatile LoggerManager instance;

    private LoggerManager() {
    }

    // 基于双重检查锁创建单例对象
    public static LoggerManager getInstance(){
        if (instance == null){
            synchronized (LoggerManager.class){
                if (instance == null){
                    instance = new LoggerManager();
                }
            }
        }
        return instance;
    }

    public void info(String module,String message){
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(time + "[INFO] [" + module + "] " + message);
    }

    static void main() {
        // 模拟两个业务模块同时写日志
        Thread userModule = new Thread(()->{
            LoggerManager logger = LoggerManager.getInstance();
            logger.info("userModule","用户登录成功....");
        });

        Thread orderModule = new Thread(()->{
            LoggerManager logger = LoggerManager.getInstance();
            logger.info("orderModule","订单创建成功");
        });

        userModule.start();
        orderModule.start();

        // 判断两个实例低下是否是同一个实例
        LoggerManager o1 = LoggerManager.getInstance();
        LoggerManager o2 = LoggerManager.getInstance();
        System.out.println("是否是同一个实例对象:" + (o1 == o2));
    }
}
