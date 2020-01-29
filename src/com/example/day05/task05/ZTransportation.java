package com.example.day05.task05;

public class ZTransportation extends Transoprtation implements Careable {
    public ZTransportation(){
        super();
    }

    public ZTransportation(String number,String model,String admin){
        super(number,model,admin);
    }

    @Override
    public void upKeep() {
        System.out.println("货物运输车辆保养完毕！");
    }

    @Override
    public void transport() {
        System.out.println("运输进行中。。。。");
    }
}
