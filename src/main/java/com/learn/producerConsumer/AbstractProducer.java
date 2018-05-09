package com.learn.producerConsumer;

/**
 * Created by wuhan on 2018/5/8.
 */
abstract class AbstractProducer implements Producer, Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
