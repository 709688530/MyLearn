package com.example.day16.task03;

public class Bank {
    private int sum;
    public void add(int num){
        sum = sum + num;
        System.out.println("账户余额："+sum);
    }
}
