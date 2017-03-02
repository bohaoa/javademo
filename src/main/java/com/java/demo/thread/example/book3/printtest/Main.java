package com.java.demo.thread.example.book3.printtest;

/**
 * Created by boge on 17/2/23.
 */
public class Main  {
    public static void main(String[] args) {
        MyService myService = new MyService();
        // 单生产者单消费者
//        ThreadA threadA = new ThreadA(myService);
//        ThreadB threadB = new ThreadB(myService);
//        threadA.start();
//        threadB.start();
        // 多生产者多消费者
        ThreadA[] threadAs = new ThreadA[10];
        ThreadB[] threadBs = new ThreadB[10];
        for (int i=0; i<10; i++){
            threadAs[i] = new ThreadA(myService);
            threadBs[i] = new ThreadB(myService);
            threadAs[i].start();
            threadBs[i].start();
        }
    }
}
