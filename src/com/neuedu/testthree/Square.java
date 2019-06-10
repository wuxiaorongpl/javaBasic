package com.neuedu.testthree;

public class Square extends Graphic {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void length() {
        System.out.println(4*side);
    }
    @Override
    public void area() {
        System.out.println(side*side);
    }
}
