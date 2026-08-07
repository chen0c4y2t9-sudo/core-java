package com.krisswen.demo3;
/**
 *  枚举类： 使用enum关键字来声明，枚举类的定义格式如下：
 *  访问修饰符  enum 枚举类名{
 *      常量对象列表
 *  }
 *
 *  访问修饰符  enum 枚举类名{
 *      常量对象列表
 *      对象的实例变量列表;
 *  }
 *
 *  常量对象列表:必须定义在枚举类的首行，因为是常量，所以名称必须大写。
 *  列出来的实例，系统会自动的加上public static final修饰。
 *  如果常量对象列表后面没有其他的代码，那么;可以省略的，否则不能省略
 */
public enum SeasonEnum {
    SPRING("春天","春天万物复苏"),
    SUMMER("夏天","夏天生机勃勃"),
    AUTUMN("秋天","秋天硕果累累"),
    WINTER("冬天","冬天万物冬眠");

    private final String seasonName;
    private final String seasonDesc;

    SeasonEnum(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}
