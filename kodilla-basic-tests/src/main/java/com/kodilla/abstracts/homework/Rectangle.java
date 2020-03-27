package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle() {
        super(2, 3);
    }

    @Override
    public void surfaceAreaCalculation() {
        System.out.println("The surface of the rectangle is" + " " + getA()*getB());
    }

    @Override
    public void circumference() {
        System.out.println("The circumference of the ractangle is"+ " " + (getA()+getB())*2);
    }
}
