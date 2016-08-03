package com.java.demo.ioc;

import com.java.demo.ioc.helloworld.HelloApi;


public class HelloApiInstanceFactory {
    
    public HelloApi newInstance(String message) {
        return new HelloImpl2(message);
    }
    
}
