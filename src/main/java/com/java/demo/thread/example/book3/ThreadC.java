package com.java.demo.thread.example.book3;

/**
 * Created by boge on 17/2/23.
 */
public class ThreadC extends Thread {

    private MyService myService;
    public ThreadC(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitC();
    }

}
