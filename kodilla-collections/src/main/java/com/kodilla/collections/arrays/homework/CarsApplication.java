package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    private static final int MAX_CARS = 15;
    private static final Random RANDOM = new Random();

    public static Car getCarByName(String name) {
        switch (name) {
            case Ford.NAME:
                return new Ford();
            case Opel.NAME:
                return new Opel();
            case Toyota.NAME:
                return new Toyota();
        }
    }

    private static Car[] initCars() {
        Car[] cars = new Car[RANDOM.nextInt(MAX_CARS + 1)];
        Car car = CarUtils.getCarByName(carName);
        for (int n = 0; n < RANDOM.nextInt(5) + 1; n++) {
            car.increaseSpeed();
    }

    private static void describeCars(Car[] cars) {
    }
}