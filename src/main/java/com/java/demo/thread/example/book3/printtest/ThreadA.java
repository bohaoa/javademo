package com.java.demo.thread.example.book3.printtest;


/**
 * Created by boge on 17/2/23.
 */
public class ThreadA extends Thread {

    private MyService myService;
    public ThreadA(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {

        //for (int i=0; i<10; i++){
            myService.get();
        //}
    }
}
