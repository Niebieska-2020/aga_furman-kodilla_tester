package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getFiled() {
        return getA()*getB();
    }

    @Override
    public double getCircumference() {
        return (getA()+getB())*2;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
