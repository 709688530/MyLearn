package com.example.day17.task02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendTask implements Runnable {
    private int sendPort;
    public SendTask(int sendPort){
        this.sendPort = sendPort;
    }
    @Override
    public void run() {
        try {
            DatagramSocket ds = new DatagramSocket();
            Scanner sc = new Scanner(System.in);
            while (true){
                String data = sc.nextLine();
                byte[] buf = data.getBytes();
                DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("172.0.0.225"), sendPort);
                ds.send(dp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
