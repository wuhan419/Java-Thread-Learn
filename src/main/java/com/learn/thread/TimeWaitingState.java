package com.learn.thread;

/**
 * Created by wuhan on 2018/5/4.
 */
public class TimeWaitingState {
    /**
     * 有时间的等待
     * */
    public static  void  main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread-A over");
            }
        }, "WAITING-Thread-A");
        threadA.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadA.getState()); // TIMED_WAITING
    }
}
