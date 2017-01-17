package com.java.demo.rpc.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by boge on 17/1/16.
 */
public class HelloServer {

    public HelloServer() {
    }

    public static void main(String[] args) {
        new HelloServer().start();
    }

    public void start() {
        IHello iHello = new HelloImpl();
        try {
        	LocateRegistry.createRegistry(10000);
            Naming.bind("rmi://127.0.0.1:10000/iHello", iHello);
            
            System.out.println("启动服务器成功！");
            
            while(true);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
