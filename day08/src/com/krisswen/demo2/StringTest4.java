package com.krisswen.demo2;

import java.util.Scanner;

/**
 * 模拟登录，用户连续登录3次，登录失败，输出账户锁定，不允许再次登录
 */
public class StringTest4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // 准备用户名和密码
        String username = "admin";
        String password = "admin123";
        int flag = 3; // 记录尝试登录的次数
        for(int i = 0;i<3;i++){
            System.out.println("请输入用户名:");
            String input_name = sc.next();
            System.out.println("请输入密码:");
            String input_password = sc.next();
            if(input_name.equals(username) && input_password.equals(password)){
                System.out.println("用户名密码输入正确，欢迎你.....");
                break;
            }else if(flag == 1){
                System.out.println("用户名密码输入错误，账户被锁定");
            }else{
                System.out.println("用户登录失败，还剩下" + (--flag) + "次机会");
            }
        }
    }
}
