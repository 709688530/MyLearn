package com.example.day04.tesk02;

class Dog implements Animal{

    @Override
    public void breathe() {
        System.out.println(ANIMAL_BEHAVIOR+":"+"狗在呼吸");
    }

    @Override
    public void run() {
        System.out.println(ANIMAL_BEHAVIOR+":"+"狗在奔跑");
    }
}