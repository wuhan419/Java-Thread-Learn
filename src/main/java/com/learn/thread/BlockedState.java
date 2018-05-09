package com.learn.thread;

/**
 * Created by wuhan on 2018/5/4.
 */
public class BlockedState {
    protected static class RunThread implements Runnable{

        @Override
        public void run() {
            doSomething();
        }
        private synchronized void doSomething(){
            //模拟操作
            try {
                Thread.sleep(1000000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 死锁
     * */
    public static  void  main(String[] args) {
        RunThread rt = new RunThread();
        Thread threadA = new Thread(rt,"thread-A");
        Thread threadB = new Thread(rt,"thread-B");
        threadA.start();
        threadB.start();
    }
}
