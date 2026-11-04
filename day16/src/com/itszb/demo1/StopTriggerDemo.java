package com.itszb.demo1;

public class StopTriggerDemo {
    private volatile boolean stop = false;

    public void requestStop(){
        stop = true;
    }

    public void work(){
        while (!stop){
            //
        }
        System.out.println("Worker stopped....");
    }

    static void main() throws Exception{
        StopTriggerDemo demo = new StopTriggerDemo();
        Thread worker = new Thread(demo::work);
        worker.start();

        Thread.sleep(1000);
        demo.requestStop();
    }
}
