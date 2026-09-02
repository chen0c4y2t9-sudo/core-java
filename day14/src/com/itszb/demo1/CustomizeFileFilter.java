package com.itszb.demo1;

import java.io.File;
import java.io.FileFilter;

public class CustomizeFileFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith("java");
    }
}
