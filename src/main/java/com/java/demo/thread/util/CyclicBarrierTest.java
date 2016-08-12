package com.java.demo.thread.util;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 而CyclicBarrier一般用于一组线程互相等待至某个状态，然后这一组线程再同时执行；
 * @author Thinkpad
 *
 */
public class CyclicBarrierTest {

	public static void main(String[] args) {

		final ExecutorService es = Executors.newFixedThreadPool(10);
		final CyclicBarrier barrier = new CyclicBarrier(10);
		for(int i=0; i<10; i++){
			es.submit(new Runnable() {
				
				@Override
				public void run() {
					System.out.println("线程"+Thread.currentThread().getName()+"正在写入数据...");
		            try {
		                Thread.sleep((long) (Math.random() * 1000));      //以睡眠来模拟写入数据操作
		                System.out.println("线程"+Thread.currentThread().getName()+"写入数据完毕，等待其他线程写入完毕");
		                barrier.await();
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }catch(BrokenBarrierException e){
		                e.printStackTrace();
		            }
		            System.out.println("所有线程写入完毕，继续处理其他任务...");
						
				}
			});
		}
		es.shutdown();
	}

}
