package com.example.day05.task02;

/*
Object类常用的方法
每个类都直接或间接地继承该类

equals();----指示其他对象是否与该对象相等
getClass();--返回此Object的运行时类
hashCode();--返回该对象的哈希值
toString();--返回该对象的字符串表示
 */
public class Example14 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.toString());
    }
}
