package com.xh.rmi.api;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHello extends Remote {

    String hello(String username) throws RemoteException;

    UserDto setAge(UserDto userDto) throws RemoteException;
}
