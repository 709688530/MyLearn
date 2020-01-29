package com.example.day11.task03;

public class Books {
    int id;
    String name;
    double price;
    int number;
    double money;
    String Publish;

    public Books(int id, String name,double price, int number, double money, String publish) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.money = money;
        this.Publish = publish;
        this.price = price;
    }

    @Override
    public String toString() {
        String message = "图书编号：" + id + "图书名称：" + name + "出版社："
                + Publish + "单价：" + price + "库存量：" + number;
        return message;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

