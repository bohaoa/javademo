package com.java.demo.thread.example.book2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by boge on 17/2/22.
 */
public class MyList {

    private static List list = new ArrayList();
    public static void add(){
        list.add("1");
    }

    public static int size(){
        return list.size();
    }

}
