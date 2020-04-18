package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    int speed;

    public Toyota(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        return speed +=30;
    }

    @Override
    public int decreaseSpeed() {
        return speed -=5;
    }
}
