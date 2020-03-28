package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseYear;

    public void turnOn() {
        System.out.println("Turn on the operating system.");
    }

    public void turnOff() {
        System.out.println("Turn off the operating system.");
    }

    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void displayreleaseYear() {
        System.out.println("Year of release of the operating system:" + " " + getReleaseYear()+".");
    }
}
