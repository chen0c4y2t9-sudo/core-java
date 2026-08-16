package com.itszb.demo4;

public class TestUserDao {
    static void main() {
       /* UserDao userDao = new UserDao() {
            @Override
            public void add() {
                System.out.println("add方法被实现了");
            }
        };*/

        // 使用lambda表达式对接口中的方法进行实现
        UserDao userDao = ()->{
            System.out.println("add方法被实现了.....");
        };

        userDao.add();
    }
}
