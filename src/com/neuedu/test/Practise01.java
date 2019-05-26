package com.neuedu.test;

/*打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如： 153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
        1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。*/
public class Practise01 {
    public static void main(String []args){
    for(int n=100;n<=999;n++){
        int h = n/100;
        int t = (n/10)%10;
        int u = n%10;
        if(n==h*h*h+t*t*t+u*u*u){
            System.out.println("水仙花数："+n);
        }else{
            continue;
        }
        }
    }
}
