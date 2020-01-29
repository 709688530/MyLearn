package com.example.day06.task01;

public class StringTest {
    public static void main(String[] args) {
        String str1,s,s1,s2;

        {//String类的初始化
            str1 = "abc";
            s = new String();//创建一个空的字符串
            s1 = new String("  adasd   ");//根据指定的字符串内容创建对象
            char[] chars = new char[]{'a','b','v'};
            s2 = new String(chars);//字符串数组创建对象
        }

        int a = s1.indexOf('b');//字符串b第一次出现处的索引
        int a1 = s1.lastIndexOf('a');//字符串a最后一次出现处的索引
        int as = s1.lastIndexOf("as");
        char c = s1.charAt(2);//返回2位置上的字符（从0开始）
        boolean d = s1.endsWith("d");//判断该字符串是否以d结尾
        boolean adasd = s1.equals("adasd");//与指定字符串比较是否相同
        boolean a2 = s1.startsWith("a");//判断是否以a开头
        boolean as1 = s1.contains("as");//判断是否包含as

        s1.toLowerCase();//将所有字符串都转化为小写
        String s3 = s1.toUpperCase();//将所有字符串转化成大写
        char[] chars1 = s1.toCharArray();//将此字符串转化成字符串数组
        String replace = s1.replace("a", "v");//将s1中所有a用v替换

        String trim = s1.trim();//去除原字符串首尾的空格

        System.out.println(s1);
        System.out.println(trim);
    }
}
