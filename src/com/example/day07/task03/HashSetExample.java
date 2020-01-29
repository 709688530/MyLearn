package com.example.day07.task03;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        Student jack = new Student("1", "Jack");
        Student eva = new Student("2", "eva");
        Student jack1 = new Student("2", "Jack");

        set.add(jack);
        set.add(eva);
        set.add(jack1);

        System.out.println(set);
    }
}
