package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {

    private static final Random RANDOM = new Random();
    private static final int MAX_CARS = 15;
    private static final String[] CAR_NAMES = new String[]{Ford.class.getSimpleName(), Opel.class.getSimpleName(), Toyota.class.getSimpleName()};
    private static final int MAX_SPEED_INCREASES = 5;

    public static void main(String[] args) {
        Car[] cars = initCars();
        describeCars(cars);
    }

    private static Car[] initCars() {
        Car[] cars = new Car[RANDOM.nextInt(MAX_CARS) + 1];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
        }
        return cars;
    }

    private static void describeCars(Car[] cars) {
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar() {
        Car car = CarUtils.getByName(randomCarName());
        for (int i = 0; i < RANDOM.nextInt(MAX_SPEED_INCREASES) + 1; i++) {
            car.increaseSpeed();
        }
        return car;
    }

    private static String randomCarName() {
        return CAR_NAMES[RANDOM.nextInt(5)];
    }
}

