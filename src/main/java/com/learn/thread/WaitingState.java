package com.learn.thread;

/**
 * Created by wuhan on 2018/5/4.
 */
public class WaitingState {
    /**
     * 等待状态
     * */
    public static  void  main(String[] args) {
        final Object lock = new Object();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    try {
                        lock.wait();
                        System.out.println("wait over");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "WAITING-Thread-A");
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    try {
                        Thread.sleep(20000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.notifyAll();
                }
            }
        }, "WAITING-Thread-B");
        threadA.start();
        threadB.start();
    }
}
