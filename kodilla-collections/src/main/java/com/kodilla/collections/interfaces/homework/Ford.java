package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 20;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
        if ((speed -= 10) < 0) {
            speed = 0;
        }
        return;
    }
}
