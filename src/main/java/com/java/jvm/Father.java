package com.java.jvm;

/**
 * Created by boge on 17/2/13.
 */
public class Father extends Super {

    public static int m = 2;
    static {
        System.out.println("加载了father...");
    }
}
