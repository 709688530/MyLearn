package com.example.day16.task03;

public class SaveMoenyTest {
    public static void main(String[] args) {
        Customer c = new Customer();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
