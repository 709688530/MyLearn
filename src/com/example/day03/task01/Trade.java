package com.example.day03.task01;

import com.example.day03.task01.Bank;

import java.util.Scanner;
/*
-------银行存取款系统-------
缺少用户名校验

 */
public class Trade {
    public static void main(String[] args) {
        Bank.bankName = "招商银行";
        Bank.welcome();
        boolean p=true;
        while (p) {
            System.out.println("---------开户请输入1，存取款请输入2,离开请输入其他数字！---------");
            Scanner select = new Scanner(System.in);
            int i = select.nextInt();
            if (i == 1) {
                System.out.println("---------请输入您的用户名、密码、存款金额。---------");
                Scanner ifo = new Scanner(System.in);
                Bank bank = new Bank(ifo.next(), ifo.next(), ifo.nextDouble());
            } else if (i == 2) {
                System.out.println("---------存款请输入1，取款请输入2！---------");
                Scanner selectDs = new Scanner(System.in);
                int user = selectUser();
                int y = select.nextInt();
                if (y == 1){
                    System.out.print("请输入存款金额：");
                    Scanner de = new Scanner(System.in);

                }else if(y == 2){
                    System.out.print("请输入您的密码和取款金额：");
                    Scanner de = new Scanner(System.in);

                }
            } else {
                p = false;
            }
        }
        Bank.welcomeNext();
    }

    public static int selectUser(){

        int x=0;
        Bank b1 = new Bank("小明", "123", 100.0);
        Bank b2 = new Bank("小红", "123", 100.0);
        Bank b3 = new Bank("小王", "123", 100.0);
        String[] arr = {b1.getName(),b2.getName(),b3.getName()};
        System.out.println("请输入您的用户名：");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        for (int i = 0;i < 2;i++){
            if (next == arr[i]){
                x = i;
            }
        }
        return x;
    }

}