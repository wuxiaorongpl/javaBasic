package com.neuedu.testone;

public class Homework2 {
    public static void main(String[] args) {
        //2 判断101-200之间有多少个素数，并输出所有素数。
        int sum=0;
        for (int i = 101; i < 201; i++){
            for (int j = 2; j <=i; j++){
                if(j==i){
                    System.out.println(j);
                }else if(i%j==0){
                    sum++;
                    break;
                }
            }
        }
        System.out.println("总共有"+(100-sum)+"个素数");
    }
}



