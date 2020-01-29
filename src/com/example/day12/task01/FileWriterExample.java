package com.example.day12.task01;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("src.txt",true);
        String str = "你好啊 ！！！！！！！！！！！！！！！！！！！";
        writer.write(str);
        writer.write("\r\n");
        writer.close();
    }
}
