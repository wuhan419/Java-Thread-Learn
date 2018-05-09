package com.learn.thread;

/**
 * Created by wuhan on 2018/5/4.
 */
public class TerminatedState {
    /**
     * 线程终止
     * */
    public static  void  main(String[] args) {
        Thread threadA = new Thread();
        threadA.start();
        try {
            Thread.sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadA.getState());
    }
}
