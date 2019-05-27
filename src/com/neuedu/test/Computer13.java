package com.neuedu.test;

public class Computer13{
    public double add(double sum1,double sum2) {
        return sum1 + sum2;
    }
    public  double minus(double sum1,double sum2){
        return sum1-sum2;
}
    public double multiple(double sum1,double sum2){
        return sum1*sum2;
    }
    public double divide(double sum1,double sum2){
        if (sum2!=0){
            return sum1/sum2;
        }else {
            System.out.println("算数不成立");
        }
        return 0;
    }
}
