package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShapeTestSuite {

    @Test
    public void checkingAreaOfShapes() {
        // given
        Shape shape = new Circle(5);
        Shape shape1 = new Square(3);
        Shape shape2 = new Triangle(4, 6, 4);

        // then
        Assertions.assertEquals(79.0, Math.round(shape.getArea()), 0.01);
        Assertions.assertEquals(9, shape1.getArea(), 0.01);
        Assertions.assertEquals(12, shape2.getArea(), 0.01);
    }

    @Test
    public void checkingPerimeterOfShapes() {
        // given
        Shape shape = new Circle(5);
        Shape shape1 = new Square(3);
        Shape shape2 = new Triangle(4, 6, 4);

        // then
        Assertions.assertEquals(31.0, Math.round(shape.getPerimeter()), 0.01);
        Assertions.assertEquals(12, shape1.getPerimeter(), 0.01);
        Assertions.assertEquals(14, shape2.getPerimeter(), 0.01);
    }
}
