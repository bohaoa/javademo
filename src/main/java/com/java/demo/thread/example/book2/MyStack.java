package com.java.demo.thread.example.book2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by boge on 17/2/22.
 */
public class MyStack {

    private List list = new ArrayList();

    synchronized public void push(){
        try {
            while(list.size() == 1){
                this.wait();
            }
            list.add("anyString="+Math.random());
            this.notifyAll();
            System.out.println("push="+list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop(){
        System.out.println(">>>");
        String returnValue = null;
        try {
            while(list.size() == 0){
                System.out.println("pop操作中的线程："+Thread.currentThread().getName()+" 处于wait状态");
                this.wait();
            }

            returnValue = list.get(0)+"";
            list.remove(0);
            this.notifyAll();

            System.out.println("pop size:"+list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }


}
