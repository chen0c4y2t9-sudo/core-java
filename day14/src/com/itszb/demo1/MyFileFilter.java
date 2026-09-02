package com.itszb.demo1;

import java.io.File;
import java.io.FilenameFilter;

public class MyFileFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
        File file  = new File(dir,name);
        return file.isDirectory();
    }
}
