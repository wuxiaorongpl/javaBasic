package com.neuedu.five;

public class Test1 {
    public static void main(String[] args) {

//使用多态分别创建学生类型对象，主持人类型对象
        Student x = new Boy();
        Compere z = new Guil();
        Class b = new Class();
        b.wanhui(z, x);
    }
}
