package com.neuedu.test;

public class TestClass14 {
    public static void main(String[] args) {
        Car14 car14=new Car14();
        car14.mark = "宝马";
        System.out.println("品牌:"+car14.mark);
        car14.price=1520000;
        System.out.println("价格"+car14.price);
        car14.speed=80;
        System.out.println("以前的速度"+car14.speed);
        car14.speedChange(100);

    }
}
