package com.java.demo.rpc.rmi;

import java.io.Serializable;
import java.rmi.RemoteException;

/**
 * Created by boge on 17/1/16.
 */
public class HelloImpl implements IHello, Serializable{

    @Override
    public String hello(String msg) throws RemoteException {
        return "远程调用"+msg;
    }
}
