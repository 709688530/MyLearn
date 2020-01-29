package com.example.day16.task01;

public class RunableTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
        while (true){
            System.out.println("main running!");
        }
    }


    static class MyThread implements Runnable{
        @Override
        public void run() {
            while (true){
                System.out.println("Mythread类的run方法在运行！");
            }
        }
    }
}
