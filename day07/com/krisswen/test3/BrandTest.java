package com.krisswen.test3;

public class BrandTest {
    static void main(String[] args) {
        // 遍历所有枚举类的常量
        for(BrandEnum brand : BrandEnum.values()){
            System.out.println("序号:" + brand.ordinal()
            + " | 英文名称: " + brand.name()
            + " | 中文名称:" + brand.getChineseName()
            + " | 操作系统:" + brand.getSystem());
        }
        System.out.println("-------------------------------");
        // 通过switch匹配APPLE
        BrandEnum phone = BrandEnum.APPLE;
        switch (phone){
            case APPLE:
                System.out.println("苹果手机使用ios系统，流程稳定");
                break;
            default:
                System.out.println("非苹果操作系统");
                break;
        }
    }
}
