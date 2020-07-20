package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTestSuite {

    private Square square = new Square(10);
    private Circle circle = new Circle(5);
    private Rectangle rectangle = new Rectangle(3, 4);

    @Test
    public void checkGetSideForSquare() {
        assertEquals(10, square.getSide());
    }

    @Test
    public void checkingCircumferenceForSquare() {
        assertEquals(40, square.getCircumference());
    }

    @Test
    public void checkingAreaForSquare() {
        assertEquals(100, square.getFiled());
    }

    @Test
    public void checkGetRadiusForCircle() {
        assertEquals(5, circle.getRadius());
    }

    @Test
    public void checkingCircumferenceForCircle() {
        assertEquals(2 * PI*circle.getRadius(), circle.getCircumference(), 0.01);
    }

    @Test
    public void checkingAreaForCircle() {
        assertEquals(PI * Math.pow(circle.getRadius(), 2), circle.getFiled(), 0.01);
    }

    @Test
    public void checkingDimensionsForRectangle() {
        assertEquals(3, rectangle.getA());
        assertEquals(4, rectangle.getB());
    }

    @Test
    public void checkingCircumferenceForRectangle() {
        assertEquals(12, rectangle.getFiled());
    }

    @Test
    public void checkingAreaForRectangle() {
        assertEquals(14, rectangle.getCircumference());
    }
}
