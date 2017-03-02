package com.java.demo.thread.blocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by boge on 17/2/16.
 */
public class LinkedBlockingQueueTest {

    private final LinkedBlockingQueue<String> lbqueue = new LinkedBlockingQueue<String>();
    class ThreadA implements Runnable {
        @Override
        public void run() {
            lbqueue.offer("AAAA");
            lbqueue.offer("BBBB");
            lbqueue.offer("CCCC");
            lbqueue.offer("DDDD");
            lbqueue.offer("EEEE");
        }
    }
    
    class ThreadB implements Runnable {
        @Override
        public void run() {
            try {
                for (int i=0; i < 5; i++) {
                    System.out.println(lbqueue.take());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        LinkedBlockingQueueTest test = new LinkedBlockingQueueTest();
        ThreadA threadA = test.new ThreadA();
        ThreadB threadB = test.new ThreadB();
        service.execute(threadA);
        service.execute(threadB);
    }

}
