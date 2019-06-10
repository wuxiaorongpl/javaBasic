package com.neuedu.five;

public class Class {
    public void wanhui(Compere z,Student x){

        //调用主持人主持方法
        z.zhuchi();

        //打印一句话
        System.out.println("晚会正式开始……");

        //调用学生吃的方法
        x.chi();
    }
}

