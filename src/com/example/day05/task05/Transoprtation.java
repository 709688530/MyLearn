package com.example.day05.task05;
/*
抽象类不可以被实例化，因为抽象类中有可能包含抽象方法，抽象方法是没有方法体的，不可以被调用
如果想用抽象类中的的方法，需要创建一个子类，在子类中将抽象类中的抽象方法进行实现。
 */
public abstract class Transoprtation {
    private String number;//编号
    private String model;//型号
    private String admin;//运货负责人
    public Transoprtation(){
        super();
    }
    public Transoprtation(String number,String model,String admin){
        this.number = number;
        this.model = model;
        this.admin = admin;
    }
    public abstract void transport();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
}
