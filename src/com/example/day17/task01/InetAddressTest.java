package com.example.day17.task01;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws IOException {
        InetAddress localHost = InetAddress.getLocalHost();
        InetAddress address = InetAddress.getByName("www.baidu.com");
        System.out.println("本机的IP地址："+localHost.getHostAddress());
        System.out.println("本机的名字："+localHost.getHostName());
        System.out.println("baidu的IP地址："+address.getHostAddress());
        System.out.println("3秒是否可以到达："+address.isReachable(3000));
        System.out.println("baidu的主机名："+address.getHostName());

    }
}
