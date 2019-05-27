package com.neuedu.test;


public class TestClass11 {
    public static void main(String[] args) {
        Rectangle11 rectangle11=new Rectangle11();
        int accept=rectangle11.girth(42,24);
        System.out.println("周长"+accept);
        int receive=rectangle11.area(42,24);
        System.out.println("面积"+receive);
    }
}
