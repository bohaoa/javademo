package com.java.demo.thread.example.book2;

/**
 * Created by boge on 17/2/22.
 */
public class Main {

    public static void main(String[] args) {
        String key = new String("key");
        ThreadA threadA = new ThreadA(key);
        ThreadB threadB = new ThreadB(key);
        threadA.start();
        threadB.start();
    }
}
