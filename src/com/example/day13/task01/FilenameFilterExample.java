package com.example.day13.task01;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterExample {
    public static void main(String[] args) {
        File file = new File("D:\\ideaSpcaework\\day03");
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                File currFile = new File(file, s);
                if (currFile.isFile() && s.endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        };

        if (file.exists()){
            String[] list = file.list(filter);
            for (String name :list) {
                System.out.println(name);
            }
        }
    }
}
