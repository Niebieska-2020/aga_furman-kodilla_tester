package com.kodilla.inheritance.homework;

public class Showcase {

    public static void main (String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem(2020);
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        Windows windows = new Windows(1985);
        windows.turnOn();
        windows.displayreleaseYear();

        Linux linux = new Linux(1991);
        linux.turnOff();
        linux.displayreleaseYear();
    }
}
