package com.java.demo.thread.example.book2;

/**
 * Created by boge on 17/2/22.
 */
public class ThreadC extends Thread {

    private  C c;
    public ThreadC(C c){
        this.c = c;
    }

    @Override
    public void run() {
        //while (true) {
           c.popService();
        //}
    }
}
