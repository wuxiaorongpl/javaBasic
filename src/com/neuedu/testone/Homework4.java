package com.neuedu.testone;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入当月的利润:");
        int x=s.nextInt();
        double y=0;
        if(x>=100){
            y=10*0.1+10*0.075+20*0.05+40*0.03+60*0.015+(x-100)*0.001;
        }	else if(x>=60){
            y=10*0.1+10*0.075+20*0.05+40*0.03+(x-60)*0.015;
        }   else if(x>=40){
            y=10*0.1*10*0.075+20*0.05+(x-40)*0.03;
        }	else if(x>=20){
            y=10*0.1+10*0.075+(x-20)*0.05;
        }   else if(x>=10){
            y=10*0.1+(x-10)*0.075;
        }	else{
            y=x*0.1	;
        }
        System.out.println("当月的奖金为:"+y);
    }
    }



