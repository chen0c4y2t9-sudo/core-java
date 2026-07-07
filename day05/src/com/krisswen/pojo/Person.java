package com.krisswen.pojo;

/**
 * 封装的具体事项步骤：
 *   1. 成员属性私有化
 *   2. 定义公共的set方法，外界在设置成员属性值的一个入口方法，我们可以在setff中定义封装的具体逻辑
 *   3. 提供一个公共的get方法，外界可以通过get方法访问set的成员属性。
 */
public class Person {
     private String name;
     private int age;
     private String sex;

     /*public static void test(){
          System.out.println("test方法是静态方法");
     }*/

     public void setName(String name){
          // length() 获取一个字符串的长度
          if(name.length() >=2 && name.length() <= 5){
               this.name = name;
          }else{
               name ="张三";
          }
     }

     public String getName(){
          return this.name;
     }

     public void setAge(int age){
          if(age >= 18 && age <= 60){
               this.age = age;
          }else{
               this.age = 18;
          }
     }

     public int getAge(){
          return this.age;
     }

     public void setSex(String sex){
          // equals方法：判断字符串的内容
          if(sex.equals("男") || sex.equals("女")){
               this.sex = sex;
          }else{
               this.sex = "男";
          }
     }

     public String getSex(){
          return this.sex;
     }
}
