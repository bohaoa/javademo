package com.java.demo.thread.example.book3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * condition实现顺序执行.
 */
public class Run {

    private volatile static int nextWho = 1;
    private static Lock lock = new ReentrantLock();
    private static Condition conditionA = lock.newCondition();
    private static Condition conditionB = lock.newCondition();
    private static Condition conditionC = lock.newCondition();

    public static void main(String[] args) {
        Thread threadA = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextWho != 1){
                        conditionA.wait();
                    }
                    for (int i=0; i<3; i++){
                        System.out.println("ThreadA:"+(i+1));
                    }

                    nextWho = 2;
                    conditionB.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread threadB = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextWho != 2){
                        conditionB.wait();
                    }
                    for (int i=0; i<3; i++){
                        System.out.println("ThreadB:"+(i+1));
                    }

                    nextWho = 3;
                    conditionC.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread threadC = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextWho != 3){
                        conditionC.wait();
                    }
                    for (int i=0; i<3; i++){
                        System.out.println("ThreadC:"+(i+1));
                    }

                    nextWho = 1;
                    conditionA.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread[] threadAs = new Thread[5];
        Thread[] threadBs = new Thread[5];
        Thread[] threadCs = new Thread[5];
        for (int i=0; i<10; i++){
            threadAs[i] = new Thread(threadA);
            threadBs[i] = new Thread(threadB);
            threadCs[i] = new Thread(threadC);
            threadAs[i].start();
            threadBs[i].start();
            threadCs[i].start();
        }
    }
}
