package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car {
    private int speed;
    public static String NAME = "Opel";

       public Opel() {
        NAME = "Opel";
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
        speed -=10;
           if ((speed -=10) < 0){
               speed =0;
           }
        return;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Opel)) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
