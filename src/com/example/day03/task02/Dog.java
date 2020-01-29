package com.example.day03.task02;
/*
super调用父类的成员方法、成员变量、构造函数
super只能出现在子类构造方法的第一行，且只能出现一次

 */
class Dog extends Anmial{
    String name = "犬类";

//    void shout(){
//        System.out.println("犬类发出了叫声");
//        super.shout();
//    }
    void printName(){
        System.out.println("name="+super.name);
        System.out.println(name);
    }
}