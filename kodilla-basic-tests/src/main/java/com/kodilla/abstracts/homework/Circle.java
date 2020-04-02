package com.kodilla.abstracts.homework;

public class Circle extends Shape {
        private int radius;

   public Circle(int radius){
       this.radius = radius;
   }

    @Override
    public double getFiled() {
        return Math.PI*getRadius();
    }

    @Override
    public double getCircumference() {
        return 2*Math.PI*getRadius();
    }

    public int getRadius() {
        return radius;
    }
}
