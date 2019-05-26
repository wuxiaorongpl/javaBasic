package com.neuedu.test;
//一个整数的各位数字之和能被 9 整除，则该数也能被 9 整除。编程验证给定的整数能否被 9 整除。、
import java.util.Scanner;

public class Practise10 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("请输入数值");
        int a=n.nextInt();
        int b=0;
        if (a==0){
            b+=a%10;
            a=a/10;
        }
        b+=a;
        if (b%9==0){
            System.out.println("能被9整除");
        }else{
            System.out.println("不能被9整除");
        }
    }
}
