package com.itszb.demo3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
public @interface MyAnnotation1 {
    String name();
    int num() default 0;
    boolean flag() default true;
    String[] msg();
}
