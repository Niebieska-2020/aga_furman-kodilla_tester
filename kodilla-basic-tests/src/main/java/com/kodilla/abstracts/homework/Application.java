package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.homework.Circle;
import com.kodilla.abstracts.homework.Rectangle;
import com.kodilla.abstracts.homework.Square;

public class Application {

    public static void main(String[] args) {

        Circle circle = new Circle(4);
        System.out.println("The surface of the circle is" + " " + circle.getFiled());
        System.out.println("The circumference of the circle is" + " " + circle.getCircumference());

        Rectangle rectangle = new Rectangle(2,3);
        System.out.println("The surface of the rectangle is" + " " + rectangle.getFiled());
        System.out.println("The circumference of the rectangle is" + " " + rectangle.getCircumference());

        Square square = new Square(5);
        System.out.println("The surface of the square is" + " " + square.getFiled());
        System.out.println("The circumference of the square is" + " " + square.getCircumference());
    }
}
