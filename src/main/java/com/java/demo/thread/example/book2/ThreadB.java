package com.java.demo.thread.example.book2;

/**
 * Created by boge on 17/2/22.
 */
public class ThreadB extends Thread {

    private Object lock;

    public ThreadB(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for(int i=0; i<10; i++){
                    MyList.add();
                    if(MyList.size() == 5){
                        System.out.println("notify begin, "+System.currentTimeMillis());
                        lock.notify();
                        System.out.println("notify end, "+System.currentTimeMillis());
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
