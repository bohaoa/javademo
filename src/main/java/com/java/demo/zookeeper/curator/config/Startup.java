package com.java.demo.zookeeper.curator.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Startup {

	public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:/zookeeper/applicationContext.xml");
    }
}
