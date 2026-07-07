package com.krisswen.demo1;

import com.krisswen.demo2.Human;
import com.krisswen.demo2.Stu;
import com.krisswen.demo2.Worker;

public class TestHuman {
    static void main(String[] args) {
        //Worker worker = new Worker("小明",22,"USA");
        // 如果这里使用的是父类类型的变量来接收，这就是向上转型。这个向上转型的变量只能访问父类里面的内容
        /*Human human = new Worker("小明",22,"USA");
        human.hello();*/
        // worker.work(); 此时访问失败，只能访问父类里面的方法，不能访问子类里面特有的方法

        // 将父类型的变量强制转换成子类型的变量，这种叫向下转型。一个向下转型的对象，既可以调用父类里面的方法，也可以调用子类里面的方法
       /* Worker worker = (Worker)human;
        worker.hello();
        worker.work();*/

        // 这种强制转型就会运行时报错，因为human对象和Worker不是子父级的关系
       /* Stu stu = (Stu) human;
        stu.study();*/

      /*  Worker worker = new Worker("小明",19,"USA");
        worker.work();*/

        Human human = new Worker("小明",22,"USA");
        /**
         * 对象 instanceof 类名 判断这个对象是否属于指定的类型
         *   如果变量所引用的对象的类型是 instanceof后面的类型，这个表达式就是true
         */
        if(human instanceof Worker){
            System.out.println("这是一个Worker类型的对象");
        }
        if(human instanceof Stu){
            System.out.println("这是一个Stu类型的对象");
        }

        Stu stu1 = new Stu("eric",19,"USA");
        Stu stu2 = new Stu("eric",19,"USA");
        // equals方法底层比较的是两个对象的内存地址(是否是同一个对象)
        System.out.println(stu1.equals(stu2));
    }
}
