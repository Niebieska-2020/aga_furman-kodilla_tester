package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Usual", "L", true));
        stamps.add(new Stamp("Poland", "L", false));
        stamps.add(new Stamp("Usual", "M", false));
        stamps.add(new Stamp("Poland", "L", false));
        stamps.add(new Stamp("Poland", "L", true));

        for (Stamp stamp : stamps)  {
            if (stamps.size() == 4);
        }
        System.out.println("The stamp collection does not contain the same stamps.");
    }
}
