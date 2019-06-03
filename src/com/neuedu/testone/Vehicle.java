package com.neuedu.testone;

public class Vehicle {
    // 6编写一个Java应用程序，设计一个汽车类Vehicle，
    // 包含的属性有车轮个数wheels和车重weight。
    //小车类Car是Vehicle的子类，
    // 其中包含的属性有载人数loader。
    // 卡车类Truck是Car类的子类，
    //其中包含的属性有载重量payload。
    // 每个类都有构造方法和输出相关数据的方法。
    // 最后，写一个测试类来测试这些类的功能
    private int wheels;
    private int weight;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    //构造
    public Vehicle(int wheels,int weight){
        this.weight=weight;
        this.wheels=wheels;
    }
}

