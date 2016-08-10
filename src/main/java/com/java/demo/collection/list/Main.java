package com.java.demo.collection.list;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
//		List copyAndWriteList = new CopyOnWriteArrayList<>();
//		Vector v = new Vector();
//		v.add(1);
		Map map = new ConcurrentHashMap<>();
		map.put("1", "1");
		
		CounterPoolExecutor executor = new CounterPoolExecutor(100, 100, 0L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue<Runnable>());
		long starttime = System.currentTimeMillis();
		executor.startTime = starttime;
		executor.funName = "ListTestName";
		for(int i=0; i<1000; i++){
			executor.submit(new MapTest("", map));
		}
		
	}

}
