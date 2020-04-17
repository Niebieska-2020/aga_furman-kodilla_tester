package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(50);
        doRace(ford);

        Opel opel = new Opel(70);
        doRace(opel);

        Toyota toyota = new Toyota(100);
        doRace(toyota);
    }

    private static void doRace(Car car) {

        for(int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }

        for (int i = 0; i < 2; i++){
            car.decreaseSpeed();
        }
        System.out.println(car.getSpeed());
    }
}
