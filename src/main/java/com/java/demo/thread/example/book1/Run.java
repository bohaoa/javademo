package com.java.demo.thread.example.book1;

/**
 * Created by boge on 17/2/21.
 */
public class Run {

    public static void main(String[] args) {
        Run run = new Run();
        run.MyThreadTest();
    }
    
    private void MyThreadTest(){
    	MyThreadTest[] my = new MyThreadTest[100];
    	for (int i=0; i<100; i++){
    		my[i] = new MyThreadTest();
    	}
    	for(int i=0; i<100; i++){
    		my[i].start();
    	}
    }
    
    private void MyThread(){
    	MyThread myThread = new MyThread("a");
        Thread t1 = new Thread(myThread, "A1");
        //Thread t2 = new Thread(myThread, "A2");
//        Thread t3 = new Thread(myThread, isOpen"A3");
//        Thread t4 = new Thread(myThread, "A4");
//        Thread t5 = new Thread(myThread, "A5");
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //t2.start();
        myThread.setIsOpen(true);

//        t3.start();
//        t4.start();
//        t5.start();

//        MyThread m1 = new MyThread("A");
//        MyThread m2 = new MyThread("B");
//        m1.start();
//        m2.start();
    }
}
