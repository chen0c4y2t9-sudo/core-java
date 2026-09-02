package com.itszb.demo6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor  // 无参数的构造函数
@AllArgsConstructor  // 带所有参数的构造函数
@Data // 省略写get  set  toString的方法
public class User implements Serializable { // 序列化反序列化必须实现一个Serializable接口
    private String username;
    private String password;

    static void main() {
        User user = new User();
        user.setUsername("eric");
        user.setPassword("admin123");
        System.out.println(user);

        User user1 = new User("admin","123");
        System.out.println(user1);
    }
}
