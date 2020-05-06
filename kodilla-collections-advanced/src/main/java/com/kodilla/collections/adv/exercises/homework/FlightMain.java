package com.kodilla.collections.adv.exercises.homework;

import java.util.List;

public class FlightMain {

    public static void main(String[] args) {
            FlightFinder flightFinder = new FlightFinder(FlightRepository.getFlightsTable());
            List<Flight> fromWarszawa = flightFinder.findFlightsFrom("Warszawa");
            printFlights(fromWarszawa);
            List<Flight> toKrakow = flightFinder.findFlightsTo("Krakow");
            printFlights(toKrakow);
        }

        private static void printFlights(List<Flight> flights) {
            for (Flight flight : flights) {
                System.out.println(flight);
            }
        }
}
