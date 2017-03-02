package com.java.demo.nio.time;

/**
 * Created by boge on 17/1/22.
 */
public class TimeClient {

    public static void main(String[] args) {
        int port = 8080;
        if(args != null && args.length>0){
            try{
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException ef) {
                //采用默认端口
            }


        }
    }
}
