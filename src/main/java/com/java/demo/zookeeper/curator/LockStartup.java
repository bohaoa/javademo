package com.java.demo.zookeeper.curator;

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

	private static void printProcess(final InterProcessSemaphoreMutex processSemaphoreMutex) {
		System.out.println("isAcquiredInThisProcess: "
				+ processSemaphoreMutex.isAcquiredInThisProcess());
	}
	
	public static void main(String[] args) throws Exception {
		CuratorFramework client = ZooKeeperFactory.get();
		final InterProcessSemaphoreMutex processSemaphoreMutex = new InterProcessSemaphoreMutex(client, "/lock");
		printProcess(processSemaphoreMutex);

		System.out.println("Starting get lock...");
		boolean flag = processSemaphoreMutex.acquire(1000, TimeUnit.MILLISECONDS);
		System.out.println(flag ? "Getting lock successful." : "Getting failed!");

		printProcess(processSemaphoreMutex);

		Thread.sleep(2 * 1000);

		if (processSemaphoreMutex.isAcquiredInThisProcess()) {
			processSemaphoreMutex.release();
		}
		printProcess(processSemaphoreMutex);
		client.close();
	}

}
