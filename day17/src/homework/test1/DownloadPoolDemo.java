package homework.test1;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DownloadPoolDemo {

    public static void main(String[] args) throws InterruptedException {

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                5,
                60L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(10));

        for (int i = 1; i <= 15; i++) {
            pool.execute(new DownloadTask("文件" + i + ".zip"));
            System.out.println(">>> 提交第 " + i + " 个任务，线程数：" + pool.getPoolSize()
                    + "，活跃：" + pool.getActiveCount()
                    + "，排队：" + pool.getQueue().size());
        }

        System.out.println();
        try {
            pool.execute(new DownloadTask("文件16.zip"));
        } catch (RejectedExecutionException e) {
            System.out.println(">>> 第 16 个任务被拒绝：" + e.getClass().getSimpleName());
        }

        pool.shutdown();
        if (pool.awaitTermination(30, TimeUnit.SECONDS)) {
            System.out.println();
            System.out.println("==== 全部任务下载完成，线程池已关闭 ====");
        } else {
            pool.shutdownNow();
        }
    }
}
