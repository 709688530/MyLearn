package com.example.day12.task04;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("D:\\ideaSpcaework\\day03");
        String[] list = file.list();
        for (int i = 0; i < list.length; i++) {
            File file1 = new File(list[i]);
            if (file1.isFile()) {
                String ls = list[i];
                String str ="目录";
                while ((ls.length()+str.length()) <= 60){
                    str = "-"+str;
                }
                System.out.println(ls + str);

            }
            if (file1.isDirectory()) {

                String ls = list[i];
                String str ="目录";

                while ((ls.length()+str.length()) <= 60){
                    str = "-"+str;
                }
                System.out.println(ls + str);
            }
        }
    }

}
