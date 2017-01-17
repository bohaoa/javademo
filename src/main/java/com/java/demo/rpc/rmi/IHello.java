package com.java.demo.rpc.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by boge on 17/1/16.
 */
public interface IHello extends Remote {

    public String hello(String msg) throws RemoteException;

}
