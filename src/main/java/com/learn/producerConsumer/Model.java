package com.learn.producerConsumer;

/**
 * Created by wuhan on 2018/5/8.
 */
public interface Model {
    Runnable newRunnableConsumer();
    Runnable newRunnableProducer();
}