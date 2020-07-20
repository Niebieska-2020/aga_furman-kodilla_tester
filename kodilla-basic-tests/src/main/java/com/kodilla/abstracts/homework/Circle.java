package com.kodilla.abstracts.homework;

import static java.lang.Math.PI;

public class Circle extends Shape {
        private int radius;

   public Circle(int radius){
       this.radius = radius;
   }

    @Override
    public double getFiled() {
        return PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double getCircumference() {
        return 2*Math.PI*getRadius();
    }

    public int getRadius() {
        return radius;
    }
}
