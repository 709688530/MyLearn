package com.example.day07.task01;

import java.util.ArrayList;
import java.util.Iterator;

/*
Collection:单列集合类的接口，用于存储一系列符合某种规则的元素。
    List:元素有序，可重复
        ArrayList:查询速度很快，但是增删元素很慢
        LinkedList：双向循环链表，增删较快
    Set:元素无序，不可重复

Map：双列集合类的接口，用于存储有键（Key）、值（Value）映射关系的元素
    HashMap：
    TreeMap：

======Iterator=======
主要用于遍历Collection中的元素。(迭代器)
 */
public class CollectionClass {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("stu1");
        list.add("stu2");
        list.add("stu3");
        list.add("stu4");
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            Object next = iterator.next();
            System.out.println(next);
        }
        for (Object obj:list
             ) {
            System.out.println(obj);
        }
        System.out.println(list.size());
        System.out.println(list);

    }
}
