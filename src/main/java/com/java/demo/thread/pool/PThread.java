package com.java.demo.thread.pool;


public class PThread extends Thread {

	private ThreadPool pool;
	
	private Runnable target;
	private boolean isShutDown = false;
	private boolean isIdle = false;
	
	public PThread(Runnable target, String name, ThreadPool pool){
		super(name);
		this.pool = pool;
		this.target = target;
	}
	
	public Runnable getTarget(){
		return target;
	}
	
	public boolean isIdle(){
		return isIdle;
	}
	
	public void run(){
		while(!isShutDown){
			isIdle = false;
			if(target != null){
				target.run();
			}
			isIdle = true;
			
			try {
				pool.repool(this);
				synchronized (this) {
					wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			isIdle = false;
		}
	}
	
	public synchronized void setTarget(Runnable newTarget){
		target = newTarget;
		notifyAll();
	}
	
	public synchronized void shunDown(){
		isShutDown = true;
		notifyAll();
	}
}
