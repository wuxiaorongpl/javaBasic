package com.neuedu.testone;

public class Square1 extends Shape1 {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void girth() {
        double g=4*side;
        System.out.println("正方形周长"+g);
    }
}
