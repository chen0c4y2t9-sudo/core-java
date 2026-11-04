package homework.test1;


public class TestVolatileVisible {

    public static void main(String[] args) {
        // 二选一运行对比结果
        runWithoutVolatile();
        // runWithVolatile();
    }

    private static void runWithoutVolatile() {
        System.out.println("==== 未加 volatile 的对比实验 ====");
        FlagThread t = new FlagThread();
        t.start();

        // 主线程用 while(true) 循环监听 flag
        while (true) {
            if (t.isFlag()) {
                System.out.println("主线程感知到 flag 为 true，退出循环");
                break;
            }
        }
        System.out.println("主线程退出(注:未加 volatile 时往往看不到这行输出,说明感知不到修改)");
    }

    /** 加了 volatile 的对比实验 */
    private static void runWithVolatile() {
        System.out.println("==== 加了 volatile 的对比实验 ====");
        FlagThreadVolatile t = new FlagThreadVolatile();
        t.start();

        // 主线程用 while(true) 循环监听 flag
        while (true) {
            if (t.isFlag()) {
                System.out.println("主线程感知到 flag 为 true，退出循环");
                break;
            }
        }
        System.out.println("主线程退出(加了 volatile 后能及时感知到修改)");
    }
}
