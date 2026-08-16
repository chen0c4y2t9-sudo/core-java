package com.itszb.demo6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 使用泛型需要注意的一些事项：
 *    泛型中定义的数据类型必须是引用数据类型，基本数据类型是不可以的
 *    在指定泛型的数据类型之后，在进行数据传递时，还可以传递该类型或其子类的数据
 *    如果不加泛型，默认的泛型数据类型是Object
 *
 * 疑问：为什么不能使用基本数据类型作为泛型的类型？？？
 *   我们在声明泛型之后，进行数据存储的时候，容器底层还是会将传入的数据当成Object类型的数据存储的，比如我们存储的是Integer类型的数据，在底层
 *   容器还是会将Integer类型的数据强制转换成Object类型的数据。如果泛型支持基本数据类型的话，我们需要将基本数据类型转换成Object类型的数据，
 *   这个是做不到的，必须通过包装类型来实现。所以泛型只是支持引用数据类型。
 */
public class Demo1 {
    static void main() {
        /**
         * 泛型擦除:
         *    我们在编码期间，会指定泛型的数据类型。在编译之后，生成的字节码文件里面，我们加入的泛型就不会存在了。比如我们在编码期间声明类名<数据类型>
         *    ，但是在编译之后，变成了类名。这种现象就是泛型的擦除。
         *    泛型擦除的好处：如果没有泛型的擦除，意味着我们在类上面指定不同的泛型类型，编译之后会生成不同版本的字节码文件，这样就会导致我们在
         *    内存中会存在大量重复的字节码文件，而泛型擦除就解决了这个问题，不管你在泛型中指定多少种不同的数据类型，当前类的字节码文件
         *    在内存中只会存在1份。
         */
        List<String> list = new ArrayList<String>();
        list.add("hello");
//        list.add(13);
//        list.add(true);
//        list.add(3.14);
//        list.add('a');
        Iterator it = list.iterator();
        // 遍历集合中的所有元素，将元素转换成String进行输出
        while(it.hasNext()){
            String next = (String)it.next();
            System.out.println(next);
        }
    }
}
