package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 30;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 5;
        if ((speed -= 5) < 0) {
            speed = 0;
        }
        return;
    }
}
