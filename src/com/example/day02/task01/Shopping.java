package com.example.day02.task01;

public class Shopping {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        product1.setProName("电视剧");
        product2.setProName("洗衣机");
        product3.setProName("豆浆机");
        product4.setProName("吹风机");

        Market market1 = new Market();
        market1.setMarketName("家乐福");
        market1.setProductArr(new Product[]{product1,product2,product3,product4});

        Person person = new Person();
        person.setName("小明");
        Product result = person.shopping(market1, "xiyiji");
        if (result != null){
            System.out.println(person.getName()+"在"+market1.getMarketName()+"超市购买了"+result.getProName());
        }else {
            System.out.println(person.getName()+"白跑了一趟，在"+market1.getMarketName()+"超市没有买");
        }
    }
}
