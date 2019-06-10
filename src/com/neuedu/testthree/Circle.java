package com.neuedu.testthree;

import com.neuedu.fore.Pizza;

import java.awt.*;

public class Circle extends CarWheel  {

    private int radius;

    public int getRadius() {
        return radius;
//      
    }

     void area() {
        System.out.println(Math.PI*radius*radius);
    }
}
