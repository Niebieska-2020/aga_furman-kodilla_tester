package com.kodilla.abstracts.homework;

public class Circle extends Shape {
        private int radius;

   public Circle(int radius){
       this.radius = radius;
   }

    @Override
    public double getFiled() {
        return 3.14*getRadius();
    }

    @Override
    public double getCircumference() {
        return 2*3.14*getRadius();
    }

    public int getRadius() {
        return radius;
    }
}
