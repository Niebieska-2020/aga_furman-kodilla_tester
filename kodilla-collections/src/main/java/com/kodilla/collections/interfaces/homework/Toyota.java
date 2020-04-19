package com.kodilla.collections.interfaces.homework;

public class Toyota implements  Car{
    int speed;
    public static String NAME = "Toyota";

    public Toyota(int speed) {
        this.speed = speed;
    }

    public Toyota() {
        NAME = "Toyota";
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        System.out.println(speed +=30);
    }

    @Override
    public void decreaseSpeed() {
        System.out.println(speed -=5);
    }

    @Override
    public String getName() {
        return NAME;
    }
}
