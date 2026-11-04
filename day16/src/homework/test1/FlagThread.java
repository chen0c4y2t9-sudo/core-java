package homework.test1;


public class FlagThread extends Thread {

    private boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            flag = true;
            System.out.println("子线程已将 flag 修改为 true");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
