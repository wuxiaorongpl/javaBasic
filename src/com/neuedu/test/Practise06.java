package com.neuedu.test;
//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。

import java.util.Scanner;

public class Practise06 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("请输入数字");
        int j=i.nextInt();
        int a=j/10000;
        int b=(j/1000)%10;
        int c=(j/1000)%100;
        int d=(j%100)/10;
        int e=j%10;
        if(j>100000||j<10000){
            System.out.println("不是一个五位数");
        }else if(a==e&&b==d){
            System.out.println("是一个回文数");
        }else{
            System.out.println("不是一个回文数");
        }
    }
}
