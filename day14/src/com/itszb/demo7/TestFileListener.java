package com.itszb.demo7;

import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

/**
 * 文件系统监听器
 */
public class TestFileListener {
    public static void main(String[] args) throws Exception{
        // 监控的文件夹路径
        String directoryPath = "F:\\io";

        // 创建一个文件观察器，用于监控指定的目录
        FileAlterationObserver observer = new FileAlterationObserver(
                directoryPath,
                FileFilterUtils.and(
                        FileFilterUtils.fileFileFilter(), // 只监控文件
                        FileFilterUtils.suffixFileFilter(".txt") // 只监控.txt文件
                )
        );

        // 创建一个监听器，用于响应文件变化事件
        observer.addListener(new FileAlterationListenerAdaptor() {
            @Override
            public void onFileCreate(File file) {
                System.out.println("文件被创建: " + file.getName());
            }

            @Override
            public void onFileDelete(File file) {
                System.out.println("文件被删除: " + file.getName());
            }
        });

        // 创建文件变化监控器，并添加观察器
        FileAlterationMonitor monitor = new FileAlterationMonitor(5000); // 检查间隔为5秒
        monitor.addObserver(observer);

        // 启动监控器
        monitor.start();
        System.out.println("文件监控启动，正在监控: " + directoryPath);
    }
}
