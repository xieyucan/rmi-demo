package com.xh.rmi.server;

import com.xh.rmi.api.IHello;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerMain {

    public static void main(String[] args) throws RemoteException
            , AlreadyBoundException, MalformedURLException {
        IHello hello = new IHelloImpl();
        LocateRegistry.createRegistry(8888);
        System.setProperty("java.rmi.server.hostname", "127.0.0.1");
        Naming.bind("rmi://localhost:8888/RHello", hello);
        System.out.println("远程Hello对象绑定成功！");
    }
}
