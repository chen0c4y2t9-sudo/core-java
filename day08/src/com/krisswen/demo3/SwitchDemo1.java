package com.krisswen.demo3;

public class SwitchDemo1 {

    static void main() {
        Integer num = test("A");
        System.out.println(num);

        //show1(null);
        Integer i = test1("");
        System.out.println(i);
    }

    public static Integer test(String str){
        return switch (str){
            case "A" -> 1;
            case "B" -> 2;
            default ->  0;
        };
    }

    public static void show(Object obj){
        if(obj instanceof String){
            System.out.println("这是一个字符串类型的数据");
        }else if(obj instanceof Integer){
            System.out.println("这是一个Integer类型的数据");
        }else{
            System.out.println("这是一个其他类型的数据");
        }
    }

    public static void show1(Object obj){
        String type = switch (obj){
            case String s -> "String";
            case Integer i -> "Integer";
            case null -> "null";
            default -> "other";
        };
        System.out.println(type);
    }

    // 在case语句里面使用when进行额外的条件检查
    public static Integer test1(String str){
        return switch (str){
            case String s when s.length() >2 && s.contains("A") -> 1;
            case String s when s.isEmpty() -> 2;
            default -> 0;
        };
    }

    // 使用switch进行区间判断
    public static String  getLevel(Integer score){
        return switch (score){
            case Integer c when c >= 90 -> "优秀";
            case Integer c when c >= 80 -> "良好";
            case Integer c when c >= 60 -> "及格";
            default -> "不及格";
        };
    }
}
