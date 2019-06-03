package com.neuedu.testone;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a:");
        int a = scanner.nextInt();
        System.out.println("请输入b:");
        int b = scanner.nextInt();
        System.out.println("最大公约数：" + new Homework3().getGcd(a,b));
    }
    public int getGcd(int a ,int b ){
        while (b>0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a ;
    }
}
