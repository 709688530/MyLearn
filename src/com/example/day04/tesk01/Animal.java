package com.example.day04.tesk01;

abstract class Animal {
    abstract void shout();
}

class Dog extends Animal{

    @Override
    void shout() {
        System.out.println("汪汪。。。");
    }
}
