package com.krisswen.demo3;

public class TestEnum {
    static void main(String[] args) {
        SeasonEnum seasonEnum = SeasonEnum.SPRING;
        System.out.println(seasonEnum);
        System.out.println(seasonEnum.getSeasonName());
        System.out.println(seasonEnum.getSeasonDesc());
    }
}
