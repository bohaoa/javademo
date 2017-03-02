package com.java.demo.thread.example.book3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by boge on 17/2/23.
 */
public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private Condition conditionC = lock.newCondition();
    private Condition conditionD = lock.newCondition();

    public void awaitC(){
        try {
            lock.lock();
            System.out.println("begin awaitc的时间为："+System.currentTimeMillis() + " thread name:"+Thread.currentThread().getName());
            conditionC.await();
            System.out.println("end awaitc的时间为："+System.currentTimeMillis() + " thread name:"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalC(){
        try {
            lock.lock();
            System.out.println("signal c的时间为："+System.currentTimeMillis());
            conditionC.signal();
        } finally {
            lock.unlock();
        }
    }
    public void signalD(){
        try {
            lock.lock();
            System.out.println("signal d的时间为："+System.currentTimeMillis());
            conditionD.signal();
        } finally {
            lock.unlock();
        }
    }

    public void awaitD(){
        try {
            lock.lock();
            System.out.println("begin awaitD的时间为："+System.currentTimeMillis() + " thread name:"+Thread.currentThread().getName());
            conditionD.await();
            System.out.println("end awaitD的时间为："+System.currentTimeMillis() + " thread name:"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void await(){
        try {
            lock.lock();
            System.out.println("Await的时间为："+System.currentTimeMillis());
            condition.await();
            System.out.println("Await的结束时间为："+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signal(){
        try {
            lock.lock();
            System.out.println("signal的时间为："+System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public void awaitA(){
        try {
            lock.lock();
            System.out.println("begin awaitA的时间为："+System.currentTimeMillis() + " thread name:"+Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitA的时间为："+System.currentTimeMillis() + " thread name:"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try {
            lock.lock();
            System.out.println("begin awaitB的时间为："+System.currentTimeMillis() + " thread name:"+Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitB的时间为："+System.currentTimeMillis() + " thread name:"+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll(){
        try {
            lock.lock();
            System.out.println("signal all的时间为："+System.currentTimeMillis()+ " thread name:"+Thread.currentThread().getName());
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
