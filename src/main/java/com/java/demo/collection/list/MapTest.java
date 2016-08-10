package com.java.demo.collection.list;

import java.util.Map;

public class MapTest implements Runnable {
	protected String name;

	private Map map;

	public MapTest() {
	}

	public MapTest(String name) {
		this.name = name;
	}

	public MapTest(String name, Map map) {
		this.name = name;
		this.map = map;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1500; i++) {
			map.get("1");
		}
	}
}
