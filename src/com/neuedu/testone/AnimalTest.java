package com.neuedu.testone;

public class AnimalTest {

    public static void main(String[] args) {

        Monkey monkey=new Monkey("Monkey");
        monkey.speak();

        System.out.println();

        People people=new People();
        people.speak();
        people.think();
    }
}
