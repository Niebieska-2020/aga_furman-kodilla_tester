package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    public Circle() {
        super(4, 0);
    }
    @Override
    public void surfaceAreaCalculation() {
        System.out.println("The surface of the circle is"+ " " + 3.14*getA()*getA());
    }

    @Override
    public void circumference() {
        System.out.println("The circumference of the circle is"+ " " + 2*3.14*getA());
    }
}
