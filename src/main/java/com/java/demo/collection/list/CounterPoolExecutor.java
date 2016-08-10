package com.java.demo.collection.list;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterPoolExecutor extends ThreadPoolExecutor {
	
	protected AtomicInteger count = new AtomicInteger(0);
	public long startTime = 0;
	public String funName = "";
	public long TASK_COUNT = 500;

	public CounterPoolExecutor(int corePoolSize, int maximumPoolSize,
			long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
	}

	@Override
	protected void afterExecute(Runnable r, Throwable t) {
		int l = count.addAndGet(1);
		
		if(l == TASK_COUNT){
			System.out.println(funName + " time:" + (System.currentTimeMillis() - startTime));
		}
	}
}
