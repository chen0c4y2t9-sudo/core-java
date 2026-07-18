package com.krisswen.test3;

public enum BrandEnum {
    // 罗列枚举常量对象列表
    HUAWEI("华为","HarmonyOS"),
    XIAOMI("小米","MIUI"),
    APPLE("苹果","IOS"),
    OPPO("欧珀","ColorOS"),
    VIVO("维沃","OriginOS");


    // 成员变量
    private String chineseName;
    public String system;

    BrandEnum(String chineseName, String system) {
        this.chineseName = chineseName;
        this.system = system;
    }

    public String getChineseName() {
        return chineseName;
    }

    public String getSystem() {
        return system;
    }
}
