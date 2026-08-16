package com.itszb.demo6;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalDemo1 {

    @Test
    public void test01(){
        Girl girl = new Girl();
        Optional<Girl> optional = Optional.of(girl);
        System.out.println(optional);

        Optional<Girl> optional1 = Optional.ofNullable(girl);
        System.out.println(optional1);
    }

    public String getName(Boy boy){
        return boy.getGirl().getName();
    }

    @Test
    public void test02(){
       /* Boy boy = new Boy();
        boy.setGirl(new Girl("lily"));
        String name = getName(boy);
        System.out.println(name);*/

        Boy boy = new Boy();
        boy.setGirl(new Girl("lily"));
        boy = null;
        String name = getName(boy);
        System.out.println(name);
    }


    // 使用Optinal类优化上面的代码
    public String getGirlName(Boy boy){
        Optional<Boy> boyOptional = Optional.ofNullable(boy);
        // 如果boy为空，使用默认值替代 new Girl("张柏芝")
        Boy boy1 = boyOptional.orElse(new Boy(new Girl("张柏芝")));
        Girl girl = boy1.getGirl();
        // 如果girl为空的话，使用orElse方法来判空，并设置默认值
        Optional<Girl> girlOptional = Optional.ofNullable(girl);
        Girl girl1 = girlOptional.orElse(new Girl("eric"));
        return girl1.getName();
    }

    @Test
    public void test03(){
        Boy boy = null;
        String name = getGirlName(boy);
        System.out.println(name);

        Boy boy1 = new Boy(new Girl("lily"));
        System.out.println(getGirlName(boy1));
    }
}
