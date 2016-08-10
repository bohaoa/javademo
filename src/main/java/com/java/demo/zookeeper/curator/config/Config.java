package com.java.demo.zookeeper.curator.config;

public interface Config {

	byte[] getConfig(String path) throws Exception;
}
