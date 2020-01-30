package com.example.day16.task03;

public class Customer implements Runnable {
    private Bank b = new Bank();
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            b.add(100);
        }
    }
}
