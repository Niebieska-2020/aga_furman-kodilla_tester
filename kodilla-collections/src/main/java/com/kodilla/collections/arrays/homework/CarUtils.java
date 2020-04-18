package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-------------------------");
        System.out.println("Brand car: " + getCarName(car));
        System.out.println("Output speed: " + car.getSpeed());
        System.out.println("Increased speed: " + car.increaseSpeed());
        System.out.println("Decreased speed: " + car.decreaseSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford) {
            return "Ford";
        } else {
            if (car instanceof Opel) {
            return "Opel";
        } else {
            if (car instanceof Toyota) {
                return "Toyota";
        } else {
            return "Unknown car brand.";
    }
}
