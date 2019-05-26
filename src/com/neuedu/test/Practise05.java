package com.neuedu.test;
//分别计算1-100之间的奇数和 和偶数和

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

public class Practise05 {
    public static void main(String[] args) {
        int SUM1=0;
        int SUM2=0;
        for(int i=1;i<=100;i++){
            if(i%2==1){
               SUM1+=i;
            }else {
                SUM2+=i;
            }
            System.out.println("奇数和："+SUM1);
            System.out.println("偶数和："+SUM2);
        }
    }
}
