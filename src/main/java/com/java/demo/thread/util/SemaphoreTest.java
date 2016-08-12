package com.java.demo.thread.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	/***
	 * 信号量模式 ，只能最多进来5个，其他的等待完成
	 * @param args
	 */
	public static void main(String[] args) {
		final Semaphore semaphore = new Semaphore(5);
		final ExecutorService es = Executors.newFixedThreadPool(8);
		int N = 8;
		
		for(int i=0; i<N; i++){
			final int num = i;
			es.submit(new Runnable() {
				
				@Override
				public void run() {
					try {
						semaphore.acquire();
						System.out.println("工人:"+num+"占用一个机器在生产...");
						Thread.sleep(2000);
		                System.out.println("工人:"+num+"释放出机器");
		                     
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						semaphore.release();      
					}
				}
			});
		}
		es.shutdown();
	}
}
