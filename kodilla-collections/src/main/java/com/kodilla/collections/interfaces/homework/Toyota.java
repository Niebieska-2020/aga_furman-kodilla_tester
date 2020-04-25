package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Toyota implements  Car {
    private int speed;
    public static String NAME = "Toyota";

    public Toyota() {
        NAME = "Toyota";
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

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toyota)) return false;
        Toyota toyota = (Toyota) o;
        return speed == toyota.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}

