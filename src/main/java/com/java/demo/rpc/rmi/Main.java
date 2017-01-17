package com.java.demo.rpc.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by boge on 17/1/16.
 */
public class Main {

    public static void main(String[] args) {
        try {
            IHello iHello = (IHello) Naming.lookup("rmi://127.0.0.1:10000/iHello");
        	System.out.println(iHello.hello("test"));
        }  catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
