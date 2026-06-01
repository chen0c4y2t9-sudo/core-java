/*
 *   字符的使用  char来描述
 *   布尔类型的使用  boolean，true or false
 * */
public class Demo4 {
    static void main(String[] args) {
        char a = 'A';
        System.out.println(a);
        char b = '啊';
        System.out.println(b);
        // 如果使用char类型的变量接收的是一个数字，这个数字代表的是字符对应的编码值
        char c = 65;
        System.out.println(c);
        //  char m = '哈哈'; // 这里会报错，以为char类型的变量只能接收1个字符,如果多个字符我们需要使用变量来保存，这个使用可以使用String类的变量
        // 这个String不属于java中的把8大基本数据类型，属于我们后面要讲的引用数据类型。
        String msg = "哈哈";
        System.out.println(msg);

        // boolean类型的变量使用，后续一般用于条件判断。
        boolean result = false;
        System.out.println(result);
        //var 根据后面的内容自动识别数据类型--不常见
        var m = 10;
        var n = 100.2334;
        System.out.println(m);
        System.out.println(n);
    }
}
