package com.example.day16.task02;

public class RunnableExample {
    public static void main(String[] args) {
        TickerWindows task = new TickerWindows();
        new Thread(task,"窗口1").start();
        new Thread(task,"窗口2").start();
        new Thread(task,"窗口3").start();
        new Thread(task,"窗口4").start();
    }

    static class TickerWindows implements Runnable{
        private int tickers = 100;
        @Override
        public void run() {
            while (true){
                if (tickers > 0){
                    Thread thread = Thread.currentThread();
                    String name = thread.getName();
                    System.out.println(name+"正在发售第"+tickers--+"张票！");
                }
            }
        }
    }
}
