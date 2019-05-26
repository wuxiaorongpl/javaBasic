package com.neuedu.test;
//用 while 循环，计算 1~200 之间所有 3 的倍数之和。

public class Practise09 {
    public static void main(String[] args) {
        int sum =0;
        int n=1;
        while(n<=200){
            if (n%3==0){
                sum=n+sum;
            }
            n++;
        }
        System.out.println("三的倍数："+sum);
    }
}
