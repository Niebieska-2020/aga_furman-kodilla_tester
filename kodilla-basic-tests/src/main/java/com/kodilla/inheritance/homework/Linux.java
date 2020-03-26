package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public Linux(int releastYear) {
        super(releastYear);
    }
}
