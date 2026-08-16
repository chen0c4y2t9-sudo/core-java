package homework.test3;

import java.util.Properties;

public class Test3 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("subject", "Java");
        prop.setProperty("time", "2h");
        prop.setProperty("stage", "入门");
        prop.setProperty("tool", "IDEA");


        System.out.println("每日学习时长：" + prop.getProperty("time"));
        System.out.println("学习目标：" + prop.getProperty("goal", "掌握核心知识点"));


        System.out.println("所有配置：");
        for (String key : prop.stringPropertyNames()) {
            System.out.println(key + "=" + prop.getProperty(key));
        }
    }
}
