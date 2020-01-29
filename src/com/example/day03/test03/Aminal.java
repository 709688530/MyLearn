package com.example.day03.test03;

/*
final 修饰的类不能被继承
修饰的方法不能被子类重写
修饰的变量是常量，只能赋值一次
 */
public class Aminal {
    public final void shout(){

    }

}

class Dog extends Aminal{

}
