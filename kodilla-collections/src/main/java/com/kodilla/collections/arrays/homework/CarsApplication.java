package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    private static final int MAX_CARS = 15;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[RANDOM.nextInt(MAX_CARS + 1)];
        for (int n = 0; n < cars.length; n++) {
            cars[n] = drawCar();
        }
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar() {
        int drawBrandCar = RANDOM.nextInt(3);
        int drawIncreaseSpeed = RANDOM.nextInt(110) + 10;
        if (drawBrandCar == 0) {
            return new Ford(drawIncreaseSpeed);
        } else {
            if (drawBrandCar == 1) {
                return new Opel(drawIncreaseSpeed);
            } else {
                return new Toyota(drawIncreaseSpeed);
            }
        }
    }
}
