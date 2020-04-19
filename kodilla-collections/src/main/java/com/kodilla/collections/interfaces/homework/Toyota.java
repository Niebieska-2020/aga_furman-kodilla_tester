package com.kodilla.collections.interfaces.homework;

public class Toyota implements  Car{
    int speed;

    public Toyota(int speed) {
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed +=30;
    }

    @Override
    public void decreaseSpeed() {
        speed -=5;
    }
}
