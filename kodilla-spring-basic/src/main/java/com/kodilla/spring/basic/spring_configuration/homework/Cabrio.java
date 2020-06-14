package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn(int time) {
        if (time >= 20 || time <= 6) {
            System.out.println("Headlights are turn on.");
            return true;
        } else {
            System.out.println("Headlights are turn off.");
            return false;
        }
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
