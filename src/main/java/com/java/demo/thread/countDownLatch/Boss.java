package com.java.demo.thread.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by boge on 17/2/16.
 */
public class Boss implements  Runnable {

    private CountDownLatch countDownLatch;

    public Boss(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("老板正在等待所有人干完活！");

        try {
            this.countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("老板开始检查！");

    }
}
