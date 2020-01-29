package com.example.day14.task01;

import java.awt.*;

public class GuiExample01 {
    public static void main(String[] args) {
        Frame frame = new Frame("我的窗口");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
        frame.setSize(400,300);
        frame.setLocation(300,200);
        frame.add(new Button("第1个按钮"));
        frame.add(new Button("第2个按钮"));
        frame.add(new Button("第3个按钮"));
        frame.add(new Button("第4个按钮"));
        frame.add(new Button("第5个按钮"));
        frame.add(new Button("第6个按钮"));
        frame.setVisible(true);
    }
}
