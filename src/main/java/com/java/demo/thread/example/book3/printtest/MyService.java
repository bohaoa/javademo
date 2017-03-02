package com.java.demo.thread.example.book3.printtest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by boge on 17/2/23.
 */
public class MyService extends Thread {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set(){
        try {
            lock.lock();
            while (hasValue){
                System.out.println("set await...");
                condition.await();
            }
            System.out.println("打印1111111");
            hasValue = true;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void get(){
        try {
            lock.lock();
            while (! hasValue){
                System.out.println("get await...");
                condition.await();
            }
            System.out.println("打印222222");
            hasValue = false;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
