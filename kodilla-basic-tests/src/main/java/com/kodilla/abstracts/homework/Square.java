package com.kodilla.abstracts.homework;

public class Square extends Shape{

    public Square() {
        super(4, 4);
    }

    @Override
    public void surfaceAreaCalculation() {
        System.out.println("The surface of the square is"+ " " + getA()*getB());
    }

    @Override
    public void circumference() {
        System.out.println("The circumference of the square is"+ " " + 4*getA());
    }
}
