package com.java.demo.zookeeper.curator;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.api.BackgroundCallback;
import org.apache.curator.framework.api.CuratorEvent;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;

/**
 * 創建鏈接並且创建新的临时znode
 * @author Thinkpad
 *
 */
public class CreateNodeBackgroundSample {

	static String path = "/zk-book";
	static CuratorFramework client = CuratorFrameworkFactory.builder()
			.connectString("192.168.100.188:2181")
			.sessionTimeoutMs(5000)
			.retryPolicy(new ExponentialBackoffRetry(1000, 3))
			.build();
	static CountDownLatch semaphore = new CountDownLatch(2);
	static ExecutorService tp = Executors.newFixedThreadPool(2);
	
	public static void main(String[] args) {
		client.start();
		System.out.println("Thread Main Name:"+Thread.currentThread().getName());
		try {
			//临时节点 EPHEMERAL
			client.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL).inBackground(new BackgroundCallback() {
				
				@Override
				public void processResult(CuratorFramework client, CuratorEvent event) throws Exception {
					System.out.println("event[code:" + event.getResultCode() + ", type:" + event.getType() + "]");
					System.out.println("Thread of processResult:"+Thread.currentThread().getName());
					semaphore.countDown();
				}
				
			}, tp).forPath(path, "init".getBytes());
			
			client.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL).inBackground(new BackgroundCallback() {
				
				@Override
				public void processResult(CuratorFramework client, CuratorEvent event) throws Exception {
					System.out.println("event[code:" + event.getResultCode() + ", type:" + event.getType() + "]");
					System.out.println("Thread of processResult:"+Thread.currentThread().getName());
					semaphore.countDown();
				}
				
			}, tp).forPath(path, "init".getBytes());
			
			semaphore.await();
			tp.shutdown();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
