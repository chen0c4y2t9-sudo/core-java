package com.itszb.demo3;

/**
 * 注解的定义格式：
 *   public @interface 注解的名称{
 *       public 属性的数据类型 属性名() default 默认值;
 *   }
 *
 * 元注解:
 * @Target注解 使用ElementType枚举类来描述注解的作用范围。 TYPE  FILED METHOD PARAMETER ...
 * @Retention注解 描述注解的生命周期 ，注解的生命周期： SOURCE  CLASS  RUNTIME
 *      SOURCE: 该注解的生命周期仅限于注释。不参与编译也不参与运行。 比如@Override注解
 *      CLASS: 该注解参与编译，但是不参与运行
 *      RUNTIME： 该注解参与编译，也参与运行。 绝大多数的注解都是使用这个声明周期
 * @Doucumented 标识当前注解会被编入到文档注释中
 * @Inherited 标识该注解修饰的类，其子类也可以使用该注解
 */
@MyAnnotation1(name = "eric",num = 10,flag = false,msg = {"aa","bb"}) // 注解可以修饰类
public class AnnotationDemo1 {

    @MyAnnotation1(name = "james",num = 101,flag = true,msg = {"cc","nn"}) // 注解可以修饰成员变量
    private String username;

    @MyAnnotation1(name = "kobe",num = 20,flag = false,msg = {"cc","nn"}) // 注解可以修饰方法
    public void show(){
        System.out.println("这是一个show方法");
    }

    // 可以修饰形式参数
    public void getName(String msg){
        System.out.println(msg);
    }

    // 注解可以修饰方法返回值
    public @MyAnnotation1(name = "sunny",num = 110,flag = false,msg = {"b","a"}) String getName(){
        return "hello";
    }
}
