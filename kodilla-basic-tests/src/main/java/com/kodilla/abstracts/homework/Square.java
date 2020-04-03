package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getFiled() {
       return getSide()*getSide();
    }

    @Override
    public double getCircumference() {
        return 4*getSide();
    }

    public int getSide() {
        return side;
    }
}
