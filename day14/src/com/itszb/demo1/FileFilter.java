package com.itszb.demo1;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter implements FilenameFilter {

    /**
     * 定义过滤的规则
     * @param dir  当前路径的目录对象
     * @param name 当前目录下面的文件名称
     * @return  true 满足过滤规则  false 不满足过滤规则
     */
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".java");
    }
}
