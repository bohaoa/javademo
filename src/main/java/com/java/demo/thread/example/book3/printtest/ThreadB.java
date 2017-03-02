package com.java.demo.thread.example.book3.printtest;

import com.java.demo.thread.example.book3.printtest.MyService;

/**
 * Created by boge on 17/2/23.
 */
public class ThreadB extends Thread {
    private MyService myService;
    public ThreadB(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        //for (int i=0; i<10; i++) {
            myService.set();
       // }
    }
}
