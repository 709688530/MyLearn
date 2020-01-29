package com.example.day13.task01;

import java.io.File;

public class Example14{
    public static void main(String[] args) {
        File file = new File("D:\\ideaSpcaework\\day03");
        fileDir(file);
    }

    public static void fileDir(File dir){
        File[] files = dir.listFiles();
        for (File file: files
             ) {
            if (file.isDirectory()){
                fileDir(file);
            }
            System.out.println(file.getAbsolutePath());
        }
    }
}
