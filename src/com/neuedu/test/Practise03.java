package com.neuedu.test;
//题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？ 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。

public class Practise03 {
    public static void main(String[] args) {
        int n=0;
        int a,b,c;
        for (a=1;a<5;a++){
            for(b=1;b<5;b++){
                for(c=1;c<5;c++){
                    if(a!=b&&b!=c&&c!=a){
                        System.out.println(a*100+b*10+c);
                        n++;
                    }
                }
            }
        }
        System.out.println("一共有："+n+"种");
    }
}
