package com.example.day16.task02;

public class ThreadExample {
    public static void main(String[] args) {
        new TicketWindows().start();
        new TicketWindows().start();
        new TicketWindows().start();
        new TicketWindows().start();
    }

    static class TicketWindows extends Thread{

        private int tickets = 100;
        public void run(){
            while (true){
                if (tickets > 0){
                    Thread th = Thread.currentThread();
                    String name = th.getName();
                    System.out.println(name + "正在发售第"+tickets--+"张票！");
                }
            }
        }
    }
}
