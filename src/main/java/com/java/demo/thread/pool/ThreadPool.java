package com.java.demo.thread.pool;

import java.util.List;
import java.util.Vector;

public class ThreadPool {

	private static ThreadPool instance = null;
	private List<PThread> idleThreads;//空闲的线程队列
	
	private int threadCounter;
	private boolean isShutDown = false;
	
	public ThreadPool(){
		this.idleThreads = (List<PThread>) new Vector(5);
		threadCounter = 0;
	}
	
	public int getCreatedThreadCounter(){
		return threadCounter;
	}
	
	public synchronized static ThreadPool getInstance(){
		if(instance == null){
			instance = new ThreadPool();
		}
		return instance;
	}
	
	protected synchronized void repool(PThread pThread){
		if(!isShutDown){
			idleThreads.add(pThread);
		} else {
			pThread.shunDown();
		}
	}
	
	public synchronized void shutDown(){
		isShutDown = true;
		for(int threadIndex = 0; threadIndex<idleThreads.size(); threadIndex++){
			PThread idleThread = idleThreads.get(threadIndex);
			idleThread.shunDown();
		}
	}
	
	public synchronized void start(Runnable target){
		PThread pThread = null;
		if(idleThreads.size()>0){
			int lastIndex = idleThreads.size() -1 ;
			pThread = idleThreads.get(lastIndex);
			idleThreads.remove(lastIndex);
			pThread.setTarget(target);
		} else {
			threadCounter ++;
			pThread = new PThread(target, "PThread #"+threadCounter, this);
			pThread.start();
		}
	}
	
	
}
