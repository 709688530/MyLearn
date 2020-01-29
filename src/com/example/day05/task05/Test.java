package com.example.day05.task05;

public class Test {
    public static void main(String[] args) {
        SendTask task = new SendTask("HYX600235", 76.34);

        task.sendBefore();
        System.out.println("=================");
        ZTransportation transportation = new ZTransportation("Z025", "大奔", "小寒");

        Phone phone = new Phone();

        task.send(transportation,phone);

        System.out.println("=================");

        task.sendAfter(transportation);
        transportation.upKeep();

    }
}
