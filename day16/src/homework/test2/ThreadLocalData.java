package homework.test2;


public class ThreadLocalData {

    // ThreadLocal:每个线程拥有自己独立的变量副本
    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    /** 存储线程私有数据 */
    public void setData(String data) {
        THREAD_LOCAL.set(data);
    }

    /** 读取当前线程自己的数据 */
    public String getData() {
        return THREAD_LOCAL.get();
    }

    /** 清除数据，防止内存泄漏(使用完调用) */
    public void remove() {
        THREAD_LOCAL.remove();
    }
}
