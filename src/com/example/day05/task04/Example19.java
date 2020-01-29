package com.example.day05.task04;
/*
匿名内部类
 */
public class Example19 {
    public static void main(String[] args) {
        animalShout(new Animal() {
            @Override
            public void shout() {
                System.out.println("喵喵。。");
            }
        });
    }

    public static void animalShout(Animal animal){
        animal.shout();
    }
}

