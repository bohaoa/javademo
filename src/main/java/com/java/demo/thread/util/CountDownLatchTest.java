package com.java.demo.thread.util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CountDownLatch一般用于某个线程A等待若干个其他线程执行完任务之后，它才执行；
 * @author Thinkpad
 * 
 * CountDownLatch : 一个线程(或者多个)， 等待另外N个线程完成某个事情之后才能执行。   
 * CyclicBarrier        : N个线程相互等待，任何一个线程完成之前，所有的线程都必须等待。
这样应该就清楚一点了，对于CountDownLatch来说，重点是那个“一个线程”, 是它在等待， 而另外那N的线程在把“某个事情”做完之后可以继续等待，可以终止。
而对于CyclicBarrier来说，重点是那N个线程，他们之间任何一个没有完成，所有的线程都必须等待。

CountDownLatch 是计数器, 线程完成一个就记一个, 就像 报数一样, 只不过是递减的.

而CyclicBarrier更像一个水闸, 线程执行就想水流, 在水闸处都会堵住, 等到水满(线程到齐)了, 才开始泄流.

 *
 */
public class CountDownLatchTest {
	
	// 模拟了100米赛跑，10名选手已经准备就绪，只等裁判一声令下。当所有人都到达终点时，比赛结束。
	public static void main(String[] args) throws InterruptedException {
		// 开始的倒数锁 
		final CountDownLatch begin = new CountDownLatch(1);
		
		final CountDownLatch end = new CountDownLatch(10);
		
		final ExecutorService es = Executors.newFixedThreadPool(10);
		
		for(int i=0; i<10; i++){
			final int NO = i + 1;  
			Runnable run = new Runnable() {
				@Override
				public void run() {	
					try {
						// 如果当前计数为零，则此方法立即返回。
                        // 等待,同时出发
						System.out.println("执行线程");
						begin.await();
						Thread.sleep((long) (Math.random() * 1000));  
                        System.out.println("No." + NO + " arrived");  
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						 // 每个选手到达终点时，end就减一
                        end.countDown();
					}
				}
			};
			es.submit(run);
		}
		System.out.println("Game Start");  
		// begin减一，开始游戏
        begin.countDown();  
        // 等待end变为0，即所有选手到达终点
        end.await();  
        System.out.println("Game Over");  
        es.shutdown();  
		
	}
	
}
