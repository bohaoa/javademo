package com.java.demo.thread.example.book2;

/**
 * Created by boge on 17/2/22.
 */
public class ThreadP extends Thread {

    private  P p;
    public ThreadP(P p){
        this.p = p;
    }

    @Override
    public void run() {
        //while (true) {
            p.pushService();
        //}
    }
}
