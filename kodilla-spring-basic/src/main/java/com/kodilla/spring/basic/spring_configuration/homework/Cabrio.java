package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio extends AbstractCar {

    public Cabrio(LocalTime hour) {
        super(hour);
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
