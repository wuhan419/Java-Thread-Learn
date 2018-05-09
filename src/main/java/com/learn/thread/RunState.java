package com.learn.thread;

/**
 * Created by wuhan on 2018/5/3.
 */
public class RunState {
    public static void main(String[] args){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < Integer.MAX_VALUE; i ++) {
                    System.out.println(i);
                }
            }
        }, "RUNNABLE-Thread");
        thread.start();
    }
}
