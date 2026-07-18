package com.krisswen.demo5;

public class TestUserDao {
    static void main() {
        // 接口的引用变量指向实现类对象
        UserDao userDao = new UserDaoImpl();
        userDao.add();
    }
}
