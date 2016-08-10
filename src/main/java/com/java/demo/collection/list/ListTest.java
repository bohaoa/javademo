package com.java.demo.collection.list;

import java.util.List;

/**
 * 集合list的测试
 * @author Thinkpad
 *
 */
public class ListTest implements Runnable {

	protected String name;
	
	private List list;
	
	public ListTest() {
	}
	
	public ListTest(String name) {
		this.name = name;
	}
	
	public ListTest(String name, List list) {
		this.name = name;
		this.list = list;
	}
	
	@Override
	public void run() {
		for(int i=0; i<1500; i++){
//			Object result = list.get(0);
			list.add(i);
		}
	}

}
