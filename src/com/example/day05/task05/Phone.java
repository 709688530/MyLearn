package com.example.day05.task05;

public class Phone implements GPS {
    public Phone(){
        super();
    }
    @Override
    public String showCoordinate() {
        String location = "193,485";
        return location;
    }

}
