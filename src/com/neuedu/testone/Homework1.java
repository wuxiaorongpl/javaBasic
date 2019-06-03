package com.neuedu.testone;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        /*
         * 验证“鬼谷猜想”：对任意自然数，若是奇数，
         * 就对它乘以3再加1；若是 偶数，就对它除以2，
         * 这样得到一个新数，
         * 再按上述计算规则进行计算，
         * 一直进 行下去，最终必然得到1。 */
        int a;
        System.out.println("请输入一个数");
        Scanner input = new Scanner(System.in);
         a=input.nextInt();
         while(a!=1){
             if(a%2==1){
            a=a*3+1;
             }else{
                 a=a/2;
             }
             System.out.println(a);
         }
        System.out.println("验证了硅谷猜想");

    }
}
