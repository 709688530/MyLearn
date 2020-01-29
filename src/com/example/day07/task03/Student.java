package com.example.day07.task03;

import java.util.HashSet;

public class Student {
    private String id;
    private String name;
    public Student(String id,String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return id + ":" + name;
    }
    public int hashCode(){
        return id.hashCode();
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Student)){//判断对象是否是Student类型的
            return false;
        }
        Student stu = (Student) obj;
        boolean b = this.id.equals(stu.id);
        return b;
    }
}



