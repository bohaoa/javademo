package com.java.demo.thread.example.book3;

/**
 * Created by boge on 17/2/23.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //main.test1();
        main.test2();
    }

    private void test2(){
        MyService myService = new MyService();
        ThreadC threadC = new ThreadC(myService);
        threadC.start();
        ThreadD threadd = new ThreadD(myService);
        threadd.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myService.signalC();
    }

    private void test1 (){
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();
        ThreadB threadb = new ThreadB(myService);
        threadb.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myService.signalAll();
    }
}
