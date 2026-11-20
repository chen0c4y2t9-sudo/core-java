package com.itszb.demo3;

@MyAnnotation3(value = "eric",num = 100.0,names = {"Apple","Pear"})
public class AnnotationDemo3 {

    @MyAnnotation3(value = "james",num = 60.0,names = {"鲜奶","酸奶"})
    public void show(){
        System.out.println("show方法执行了.....");
    }
}
