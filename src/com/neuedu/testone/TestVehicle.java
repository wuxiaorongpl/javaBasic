package com.neuedu.testone;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle a = new Vehicle(4,3);
        System.out.println("a有："+a.getWheels()+"个轮子："+a.getWeight()+"吨重");


        Car  b= new Car(4,3,4);
        System.out.println("b有："+b.getWheels()+"个轮子："+b.getWeight()+"吨重可以坐"+b.getLoader()+"个人");

        Truck  c= new Truck(6,10,5,10);
        System.out.println("c有："+c.getWheels()+"个轮子："+c.getWeight()+"吨重可以坐"+c.getLoader()+"个人载重"+c.getPayload()+"吨");

    }
}
