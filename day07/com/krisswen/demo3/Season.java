package com.krisswen.demo3;

public enum Season implements Info{
    SPRING("春天","春天万物复苏"),
    SUMMER("夏天","夏天生机勃勃"),
    AUTUMN("秋天","秋天硕果累累"),
    WINTER("冬天","冬天万物冬眠");;

    private final String seasonName;
    private final String seasonDesc;

    Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    // 对于所有的枚举对象的show方法进行统一的实现
    @Override
    public void show() {
        System.out.println("这个枚举类对季节进行了描述.....");
    }
}
