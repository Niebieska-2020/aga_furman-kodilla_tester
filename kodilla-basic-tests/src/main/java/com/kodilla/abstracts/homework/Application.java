package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.surfaceAreaCalculation();
        circle.circumference();

        Rectangle rectangle = new Rectangle();
        rectangle.surfaceAreaCalculation();
        rectangle.circumference();

        Square square = new Square();
        square.surfaceAreaCalculation();
        square.circumference();
    }
}
