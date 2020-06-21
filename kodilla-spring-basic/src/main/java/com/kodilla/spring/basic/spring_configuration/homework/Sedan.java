package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan extends AbstractCar {

    public Sedan(LocalTime hour) {
        super(hour);
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
