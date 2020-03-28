package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    @Override
    public void turnOn() {
        System.out.println("Turn on the Linux system.");;
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the Linux system.");
    }

    public Linux(int releastYear) {
        super(releastYear);
    }
}
