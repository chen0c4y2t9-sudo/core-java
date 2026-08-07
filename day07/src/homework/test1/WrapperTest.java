package homework.test1;

public class WrapperTest {
    public static void main(String[] args) {

        Integer num1 = 120;
        Integer num2 = 120;
        System.out.println("---- 120 比较 ----");
        System.out.println("120 == 120 : " + (num1 == num2));
        System.out.println("120.equals(120) : " + num1.equals(num2));


        Integer num3 = 150;
        Integer num4 = 150;
        System.out.println("\n---- 150 比较 ----");
        System.out.println("150 == 150 : " + (num3 == num4));
        System.out.println("150.equals(150) : " + num3.equals(num4));


        String str = "2025";
        int intValue = Integer.parseInt(str);
        Integer integerWrapper = intValue;
        System.out.println("\n---- 字符串转 int 再装箱 ----");
        System.out.println("int 值: " + intValue);
        System.out.println("Integer 包装类: " + integerWrapper);


        double doubleValue = 99.99;
        String doubleStr = Double.toString(doubleValue);
        Double doubleWrapper = Double.valueOf(doubleStr);
        System.out.println("\n---- double 转字符串再转回 Double ----");
        System.out.println("转换后的字符串: " + doubleStr);
        System.out.println("Double 包装类: " + doubleWrapper);


        char ch1 = '5';
        char ch2 = 'z';
        System.out.println("\n---- Character 判断 ----");
        System.out.println("'" + ch1 + "' 是否为数字: " + Character.isDigit(ch1));
        System.out.println("'" + ch2 + "' 是否为小写字母: " + Character.isLowerCase(ch2));
    }
}