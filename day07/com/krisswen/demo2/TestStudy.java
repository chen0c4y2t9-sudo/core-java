package com.krisswen.demo2;

public class TestStudy {
    static void main() {
        //Study.test01(); // 使用接口名称调用接口中的静态非抽象的方法
        Study study = new StudyImpl(); // 多态
        // study.show();
    }
}
