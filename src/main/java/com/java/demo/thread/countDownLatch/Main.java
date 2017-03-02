package com.java.demo.thread.countDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by boge on 17/2/16.
 */
public class Main {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        CountDownLatch countDownLatch = new CountDownLatch(3);

        Worker worker1 = new Worker(countDownLatch, "张三");
        Worker worker2 = new Worker(countDownLatch, "李四");
        Worker worker3 = new Worker(countDownLatch, "王五");

        Boss boss = new Boss(countDownLatch);

        service.execute(worker1);
        service.execute(worker2);
        service.execute(worker3);

        service.execute(boss);

        service.shutdown();
    }
}
