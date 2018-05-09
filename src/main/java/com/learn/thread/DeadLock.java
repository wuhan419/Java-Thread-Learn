package com.learn.thread;

/**
 * Created by wuhan on 2018/5/4.
 */
public class DeadLock {
    /**
     * 死锁
     * */
    public static  void  main(String[] args) {
        final Object lock1 = new Object();
        final Object lock2 = new Object();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + " get lock1");
                    try {
                        Thread.sleep(20000l);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (lock2) {
                        System.out.println(Thread.currentThread().getName() + " get lock2");
                    }
                }
            }
        }, "BLOCKED-Thread-A");
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + " get lock2");

                    synchronized (lock1) {
                        System.out.println(Thread.currentThread().getName() + " get lock1");
                    }
                }

            }
        }, "BLOCKED-Thread-B");
        threadA.start();
        threadB.start();
    }
}
