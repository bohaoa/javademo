package com.java.demo.thread.example.book1;

/**
 * Created by boge on 17/2/21.
 */
public class MyThread extends Thread {

    private boolean isOpen = false;

    public void setIsOpen(boolean isOpen){
        this.isOpen = isOpen;
    }

    public MyThread(String name){
        this.setName(name);
    }

    public void run(){
        //System.out.println("由" + Thread.currentThread().getName() );
        //try {
            //Thread.sleep(3000);

//            if(!isOpen) {
//                System.out.println("设置isopen为true");
//                setIsOpen(true);
//            }
       // } catch (InterruptedException e) {
        //    e.printStackTrace();
       // }
        System.out.println(Thread.currentThread().getName()+" isOpen1:" + isOpen);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ " isOpen2:" + isOpen );

        System.out.println(Thread.currentThread().getName()+" 结束run");
    }
}
