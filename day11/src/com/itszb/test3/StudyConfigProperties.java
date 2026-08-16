package com.itszb.test3;

import java.util.Properties;
import java.util.Set;

public class StudyConfigProperties {
    static void main() {
        // 创建Properties对象
        Properties prop = new Properties();
        // 添加配置项
        prop.setProperty("subject","java");
        prop.setProperty("time","2h");
        prop.setProperty("stage","入门");
        prop.setProperty("tool","IDEA");

        //查询配置项信息,不存在则返回默认值
        String studyTime = prop.getProperty("time");
        String studyTarget = prop.getProperty("studyTarget","掌握核心知识点");
        System.out.println("每日学习时长:" + studyTime);
        System.out.println("每日学习，目标:" + studyTarget);

        // 遍历所有配置项
        Set<String> keySet = prop.stringPropertyNames();
        for(String key : keySet){
            System.out.println(key + "--" + prop.getProperty(key));
        }
    }
}
