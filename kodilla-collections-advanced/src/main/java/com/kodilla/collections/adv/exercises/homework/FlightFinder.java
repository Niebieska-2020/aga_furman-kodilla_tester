package com.kodilla.collections.adv.exercises.homework;

import java.util.*;
import java.util.List;

public class FlightFinder {
    private final List<Flight> flights;

    public FlightFinder(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightFrom = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDeparture().equals(departure)) {
                flightFrom.add(flight);
            }
        }
        return flightFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightTo = new ArrayList<>();
        for (Flight flight : flights) {
             if (flight.getArrival().equals(arrival)) {
                flightTo.add(flight);
            }
        }
        return flightTo;
    }
}
