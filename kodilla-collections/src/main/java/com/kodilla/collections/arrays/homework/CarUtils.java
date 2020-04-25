package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println(car.getClass().getSimpleName() + " speed: " + car.getSpeed());
    }

    public static Car getByName(String name) {
        switch (name) {
            case "Ford":
                return new Ford();
            case "Opel":
                return new Opel();
            case "Toyota":
                return new Toyota();
            case "Seat":
            default:
                throw new IllegalArgumentException("Illegal car brand name.");
        }

    }
}



