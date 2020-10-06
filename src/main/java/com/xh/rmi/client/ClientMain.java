package com.xh.rmi.client;

import com.xh.rmi.api.IHello;
import com.xh.rmi.api.UserDto;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientMain {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        IHello hello = (IHello) Naming.lookup("rmi://127.0.0.1:8888/RHello");
        System.out.println(hello.hello("张三"));

        UserDto userDto = new UserDto();
        userDto.setUsername("宋茜");
        UserDto dto = hello.setAge(userDto);
        System.out.println(dto.toString());

    }
}
