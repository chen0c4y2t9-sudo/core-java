package homework.test1;

public class DownloadTask implements Runnable {

    private final String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " 开始下载 " + fileName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(fileName + " 下载被打断了");
            return;
        }
        System.out.println(threadName + " 下载完成 " + fileName);
    }
}
