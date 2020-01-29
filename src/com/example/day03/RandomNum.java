package com.example.day03;
/*
数字雨
 */
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        while (true) {
            for (int i = 0; i < 40; i++) {
                int nextInt = new Random().nextInt(10);
                System.out.print(nextInt + "  ");
            }
            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\n");
        }
    }
}
