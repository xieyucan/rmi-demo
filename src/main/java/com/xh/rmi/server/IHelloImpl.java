package com.xh.rmi.server;

import com.xh.rmi.api.IHello;
import com.xh.rmi.api.UserDto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IHelloImpl extends UnicastRemoteObject implements IHello {

    public IHelloImpl() throws RemoteException {
        super();
    }

    @Override
    public String hello(String username) {
        System.out.println("Connected Successfully!");
        return String.format("你好, %s", username);
    }

    @Override
    public UserDto setAge(UserDto userDto) throws RemoteException {
        userDto.setAge(26);
        return userDto;
    }
}
