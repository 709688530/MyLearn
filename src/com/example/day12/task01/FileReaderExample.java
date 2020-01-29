package com.example.day12.task01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("reader.txt");
        int ch;
        while ((ch = reader.read()) != -1){
            System.out.print((char) ch);
        }
        reader.close();
    }
}
