package com.example.day09.task01;

import java.util.*;

public class hashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("1","jack");
        map.put("2","rose");
        map.put("3","luck");
        map.put("4","ser");

        System.out.println(map.containsValue("jack"));
        System.out.println(map.get("1"));

        Collection values = map.values();
        Iterator iterator = values.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }

        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Object next = it.next();
            Object o = map.get(next);
            System.out.println(next+":"+o);

        }
    }
}
