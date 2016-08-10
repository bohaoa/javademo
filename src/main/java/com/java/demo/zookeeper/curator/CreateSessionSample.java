package com.java.demo.zookeeper.curator;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

/**
 * 創建一個session鏈接
 * @author Thinkpad
 *
 */
public class CreateSessionSample {

	public static void main(String[] args) {
		RetryPolicy retryPoliy = new ExponentialBackoffRetry(1000, 3);
		CuratorFramework client = CuratorFrameworkFactory.newClient("192.168.100.188:2181", 5000, 3000, retryPoliy);
		client.start();
		try {
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
