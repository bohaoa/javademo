package com.java.demo.thread.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by boge on 17/2/16.
 */
public class Worker implements Runnable {

    private CountDownLatch countDownLatch;
    private String name;

    public Worker(CountDownLatch countDownLatch, String name){
        this.countDownLatch = countDownLatch;
        this.name = name;
    }

    @Override
    public void run() {
        this.work();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name+" 活干完了！");
        this.countDownLatch.countDown();
    }

    private void work(){
        System.out.println(this.name+" 正在工作！");
    }
}
