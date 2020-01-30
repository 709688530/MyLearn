package com.example.day17.task02;

import java.util.Scanner;

public class CharRoom {
    public static void main(String[] args) {
        System.out.println("欢迎您进入聊天室！");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入本程序发送端口：");
        int sendPort = sc.nextInt();
        System.out.print("请输入本程序接收端口：");
        int receivePort = sc.nextInt();
        System.out.println("聊天系统启动中...");
        new Thread(new SendTask(sendPort),"发送端任务！").start();
        new Thread(new ReceiveTask(receivePort),"接受端任务！").start();
    }
}
