package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public Windows(int releastYear) {
        super(releastYear);
    }
}
