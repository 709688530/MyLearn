package com.example.day17.task02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveTask implements Runnable {
    private int receivePort;
    public ReceiveTask(int receivePort){
        this.receivePort = receivePort;
    }
    @Override
    public void run() {
        try {
            DatagramSocket ds = new DatagramSocket(receivePort);
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, buf.length);
            while (true){
                ds.receive(dp);
                String str = new String(dp.getData(), 0, dp.getLength());
                System.out.println("收到"+dp.getAddress().getHostAddress()+"---发送的数据---"+str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
