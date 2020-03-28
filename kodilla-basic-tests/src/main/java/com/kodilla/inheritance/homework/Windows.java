package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    @Override
    public void turnOn() {
        System.out.println("Turn on the Windows system.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the Windows system.");
    }

    public Windows(int releastYear) {
        super(releastYear);
    }
}
