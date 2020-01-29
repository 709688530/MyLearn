package com.example.day15.task03;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        AdminDao dao = new AdminDao();
        ArrayList<FruitItem> items = dao.queryAllData();
        System.out.println();
    }
}
