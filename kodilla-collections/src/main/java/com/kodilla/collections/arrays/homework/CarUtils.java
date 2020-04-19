package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarUtils {
    private static final Random RANDOM = new Random();

    public static void describeCar(Car car) {
        car.getClass().getSimpleName();
    }

    public static Car getCarByName(String carName) {
        private static final String[] CAR_NAMES = new String[]{Ford.class.getSimpleName(), Opel.class.getSimpleName(), Toyota.class.getSimpleName()};
        String carName = CAR_NAMES[RANDOM.nextInt(3)];
    }
}

