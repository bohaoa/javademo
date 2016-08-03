package com.java.demo.thread.pool;

public class MyThreadTest implements Runnable {

	protected String name;
	
	public MyThreadTest(){
	}
	
	public MyThreadTest(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1000; i++){
			new Thread(new MyThreadTest("testNoThreadpool"+i)).start();
		}
		System.out.println("耗时："+(System.currentTimeMillis()-start));
		
		long start2 = System.currentTimeMillis();
		for(int i=0; i<1000; i++){
			ThreadPool.getInstance().start(new MyThreadTest("testNoThreadpool"+i));
		}
		System.out.println("耗时："+(System.currentTimeMillis()-start2));
	}
	
	
	
}
