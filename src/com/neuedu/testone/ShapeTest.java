package com.neuedu.testone;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("请输入正方形的边长");
        Scanner side = new Scanner(System.in);
        Square square = new Square();
        square.setSide(side.nextDouble());
        square.girth();
        square.area();
        System.out.println();

        System.out.println("请输入圆形的半径");
        Scanner ridus = new Scanner(System.in);
        Circle circle = new Circle();
        circle.setRadius(ridus.nextDouble());
        circle.girth();
        circle.area();
    }
}