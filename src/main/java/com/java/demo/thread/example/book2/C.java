package com.java.demo.thread.example.book2;

/**
 * Created by boge on 17/2/22.
 */
public class C {

    private MyStack myStack;
    public C(MyStack myStack){
        this.myStack = myStack;
    }

    public  void popService(){
        System.out.println("pop="+myStack.pop());
    }
}
