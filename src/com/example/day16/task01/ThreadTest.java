package com.example.day16.task01;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        while (true){
            System.out.println("Main方法在运行中！");
        }
    }
    static class MyThread extends Thread{
        public void run(){
            while (true){
                System.out.println("Thread类的run()方法在运行！");
            }
        }
    }
}
