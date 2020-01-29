package com.example.day16.task02;

public class YieldThread extends Thread {
    public YieldThread(String name){
        super(name);
    }
    public void run(){
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
            if (i == 3){
                System.out.println("线程让步！");
                Thread.yield();
            }
        }
    }

    public class Example{
        public  void main(String[] args) {
            Thread th1 = new YieldThread("线程a");
            Thread th2 = new YieldThread("线程2");
            th1.start();
            th2.start();
        }
    }
}
