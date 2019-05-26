package com.neuedu.test;
//计算9！

public class Practise04 {
    public static void main(String[] args) {
        int b = 1;
        for (int a = 1;a<=9;a++){
            b = a * b;
        }
        System.out.println("9!的值为:"+b);

    }
}
