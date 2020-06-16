package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV extends AbstractCar {

    public SUV(LocalTime hour) {
        super(hour);
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
