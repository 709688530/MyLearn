package com.example.day09.task01;

import java.util.Enumeration;
import java.util.Properties;

/*
Properties是Hashtable的一个子类
    优点：主要用来存储字符串类型的建和值，在实际开发中经常使用Properties集合存取相应的配置项。
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("Backdrop-color","red");
        properties.setProperty("Font-size","14px");
        properties.setProperty("Language","chinese");
        Enumeration<?> names = properties.propertyNames();
        while (names.hasMoreElements()){
            String o =(String) names.nextElement();

            String s = properties.getProperty(o);
            System.out.println(o+":"+s);
        }
    }
}
