package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    int speed;

    public Opel(int speed) {
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed +=10;
    }

    @Override
    public void decreaseSpeed() {
        speed -=20;
    }
}
