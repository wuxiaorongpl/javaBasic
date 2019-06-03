package com.neuedu.testone;

import java.util.Scanner;

public class ShapeText {
    public static void main(String[] args) {
        System.out.println("请输入矩形的边长");
        Scanner side = new Scanner(System.in);
        Square square = new Square();
        square.setSide(side.nextDouble());
        square.girth();
        System.out.println();

        System.out.println("请输入三角形的边长");
        Scanner side1 = new Scanner(System.in);
        Triangle triangle = new Triangle();
        triangle.setSide(side.nextDouble());
        triangle.girth();

    }
}
