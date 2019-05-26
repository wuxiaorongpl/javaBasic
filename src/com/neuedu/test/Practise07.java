package com.neuedu.test;

import java.util.Scanner;

public class Practise07 {
    public static void main(String[] args) {
//        判断一个年份是平年还是闰年
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份");
        int j=sc.nextInt();
        if (j%4==0&&j%100!=0){
            System.out.println(j+"是闰年");
        }else if(j%400==0) {
            System.out.println(j+"是闰年");
            }else {
            System.out.println(j+"是平年");
        }
        }
    }

