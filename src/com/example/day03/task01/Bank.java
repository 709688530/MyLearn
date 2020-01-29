package com.example.day03.task01;

public class Bank {
    static String bankName;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String password;
    private double balance;
    private double turnover;

    static void welcome(){
        System.out.println("---------欢迎来到"+bankName+"---------");
    }

    public Bank(String name,String password,double turnover){
        this.name = name;
        this.password = password;
        this.turnover = turnover;
        this.balance = turnover - 10;
        System.out.println(name+"开户成功，余额为"+balance+"元");
    }
    public Bank(String name,double turnover){
        this.name = name;
        this.turnover = turnover;
    }
    //存款
    public void deposit(double turnover){
        balance = balance +turnover;
        System.out.println(name+" 您好，您的账户已存入"+turnover+"元!"+"当前余额为"+balance+"元");
    }

    //取款
    public void withdrawal(String password,double turnover){
        if (this.password != password){
            System.out.println("您输入的密码错误！请再次输入");
            return;
        }
        if (balance - turnover > 0){
            balance = balance - turnover;
            System.out.println(name+" 您好，您的账户已取出"+turnover+"元!"+"当前余额为"+balance+"元");
        }else {
            System.out.println("您的余额不足！");
        }
    }
    static void welcomeNext(){
        System.out.println("---------请携带好随身物品，欢迎下次光临"+bankName+"---------");
    }
}
