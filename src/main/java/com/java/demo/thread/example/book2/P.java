package com.java.demo.thread.example.book2;

import cn.javass.spring.chapter12.qualifier.Mysql;

/**
 * Created by boge on 17/2/22.
 */
public class P  {

    private MyStack myStack;
    public P(MyStack myStack){
        this.myStack = myStack;
    }

    public  void pushService(){
        myStack.push();
    }
}
