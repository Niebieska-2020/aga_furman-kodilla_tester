package com.kodilla.collections.interfaces.homework;

public class CarRace {

    private static final int INCREASE_SPEED_COUNT = 3;
    private static final int DECREASE_SPEED_COUNT = 2;

    public static void main(String[] args) {
        CarRace carRace = new CarRace();

        Ford ford = new Ford();
        carRace.doRace(ford);

        Opel opel = new Opel();
        carRace.doRace(opel);

        Toyota toyota = new Toyota();
        carRace.doRace(toyota);
    }

    private static void doRace(Car car) {
        for(int i = 0; i < INCREASE_SPEED_COUNT; i++) {
            car.increaseSpeed();
        }

        for (int i = 0; i < DECREASE_SPEED_COUNT; i++){
            car.decreaseSpeed();
        }
        System.out.println(car.getClass().getSimpleName() +": " + car.getSpeed());
    }
}
