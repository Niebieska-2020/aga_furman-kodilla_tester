package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public abstract class AbstractCar implements Car {

    protected LocalTime hour;

    public AbstractCar(LocalTime hour) {
        this.hour = hour;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return hour.getHour() >= 20 || hour.getHour() <= 6;
    }
}
