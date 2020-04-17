package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    int speed;

    public Opel(int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        System.out.println(speed +=10);
    }

    @Override
    public void decreaseSpeed() {
        System.out.println(speed -=20);
    }
}
