package com.kodilla.collections.list.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford());
        Toyota toyota = new Toyota();
        cars.add(toyota);
        cars.add(new Opel());

        cars.remove(2);
        cars.remove(toyota);

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
