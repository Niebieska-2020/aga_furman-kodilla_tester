package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    int speed;
    public static String NAME = "Ford";

    public Ford(int speed) {
        this.speed = 0;
    }

    public Ford() {
        NAME = "Ford";
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed +=20;
    }

    @Override
    public void decreaseSpeed() {
        speed -=10;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
