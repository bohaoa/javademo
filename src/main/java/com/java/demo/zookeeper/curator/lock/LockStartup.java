package com.java.demo.zookeeper.curator.lock;

import java.util.concurrent.TimeUnit;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessSemaphoreMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;

import com.java.demo.zookeeper.curator.config.ZooKeeperFactory;

/**
 * 分布式共享锁实现
 * @author Thinkpad
 *
 */
public class LockStartup {
	
	private static int number = 0;

	private static void printProcess(final InterProcessSemaphoreMutex processSemaphoreMutex) {
		System.out.println("isAcquiredInThisProcess: "
				+ processSemaphoreMutex.isAcquiredInThisProcess());
	}
	
	public static void main(String[] args) throws Exception {
		for(int i=0; i<10; i++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						test();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}).start();
		}
	}

	public static void test() throws Exception{
		CuratorFramework client = ZooKeeperFactory.get();
		final InterProcessSemaphoreMutex processSemaphoreMutex = new InterProcessSemaphoreMutex(client, "/lock");
		printProcess(processSemaphoreMutex);

//		System.out.println("Starting get lock...");
		boolean flag = processSemaphoreMutex.acquire(25000, TimeUnit.MILLISECONDS);
		System.out.println(flag ? "Getting lock successful." : "Getting failed! "+Thread.currentThread().getName());
//		printProcess(processSemaphoreMutex);
		Thread.sleep(2 * 1000);
		
		number ++;
		System.out.println(Thread.currentThread().getName()+"当前的number:"+number);
		if (processSemaphoreMutex.isAcquiredInThisProcess()) {
			processSemaphoreMutex.release();
		}
//		printProcess(processSemaphoreMutex);
		client.close();
	}
	
}
