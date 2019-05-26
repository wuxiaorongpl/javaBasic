package com.neuedu.test;

/*利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下 的用C表示。*/
public class Practise02 {
    public static void main(String[] args) {
        int a=67;
        if(a>=90){
            System.out.println("A");
        }else if(a<=89&&a>=60){
            System.out.println("B");
        }else if(a<60){
            System.out.println("C");
        }
    }

}
