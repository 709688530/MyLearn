package com.example.day10.task03;

import java.io.FileInputStream;
import java.io.IOException;

public class IOExample {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("test.txt");
        int b = 0;
        while (true){
            b = in.read();
            if (b == -1){
                break;
            }
            System.out.println(b);
        }
        in.close();
    }
}
