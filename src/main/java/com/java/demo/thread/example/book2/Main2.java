package com.java.demo.thread.example.book2;

/**
 * Created by boge on 17/2/22.
 */
public class Main2 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);

        C c = new C(myStack);
        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        ThreadP threadP = new ThreadP(p);
        ThreadP threadP1 = new ThreadP(p1);
        ThreadP threadP2 = new ThreadP(p2);
        ThreadP threadP3 = new ThreadP(p3);

        ThreadC threadC = new ThreadC(c);
        ThreadC threadC1 = new ThreadC(c1);
        ThreadC threadC2 = new ThreadC(c2);
        ThreadC threadC3 = new ThreadC(c3);


        threadC.start();
        threadC1.start();
        threadC2.start();
        threadC3.start();

        threadP.start();
        threadP1.start();
        threadP2.start();
        threadP3.start();
    }
}
