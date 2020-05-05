package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTestSuit {

    @Test
    public void findFlightsFrom() {
        // given
        FlightFinder flightFinder = new FlightFinder(FlightRepository.getFlightsTable());
        List<Flight> expectedFlightsList = new ArrayList<>();
        expectedFlightsList.add(new Flight("Warszawa", "Krakow"));
        expectedFlightsList.add(new Flight("Warszawa", "Gdansk"));

        // when
        List<Flight> resultFlightFrom = flightFinder.findFlightsFrom("Warszawa");

        // then
        assertEquals(expectedFlightsList, resultFlightFrom);
    }

    @Test
    public void testFindFlightFromWhenWeHaveNotThisCity () {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        // when
        List<Flight> weHaveNotThisCity = testFlightFinder.findFlightsFrom("Poznań");

        // then
        assertNotSame(weHaveNotThisCity, testFlightFinder);
    }

    @Test
    public void checkNotFindFlightToWhenDepartureIsEmpty() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        // when
        List<Flight> notFoundFlightFrom = testFlightFinder.findFlightsFrom(" ");

        // then
        assertNotEquals(notFoundFlightFrom, testFlightFinder);
    }

    @Test
    public void checkNotFindFlightToWhenDepartureIsNull() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        // when
        List<Flight> notFoundFlightFrom = testFlightFinder.findFlightsFrom("null");

        // then
        assertNotEquals(notFoundFlightFrom, testFlightFinder);
    }

    @Test
    public void findFlightsTo() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());
        List<Flight> expectedFlightsList = new ArrayList<>();
        expectedFlightsList.add(new Flight("Warszawa", "Krakow"));
        expectedFlightsList.add(new Flight("Gdansk", "Krakow"));

        // when
        List<Flight> resultFlightTo = testFlightFinder.findFlightsTo("Krakow");

        // then
        assertEquals(expectedFlightsList, resultFlightTo);
    }

    @Test
    public void testFindFlightToWhenWeHaveNotThisCity() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        // when
        List<Flight> weHaveNotThisCity = testFlightFinder.findFlightsTo("Poznań");

        // then
        assertNotSame(weHaveNotThisCity, testFlightFinder);
    }

    @Test
    public void checkNotFindFlightToWhenArrivalIsEmpty() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        // when
        List<Flight> notFoundFlightTo = testFlightFinder.findFlightsTo(" ");

        // then
        assertNotEquals(notFoundFlightTo, testFlightFinder);
    }

    @Test
    public void checkNotFindFlightToWhenArrivalIsNull() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        // when
        List<Flight> notFoundFlightTo = testFlightFinder.findFlightsTo("null");

        // then
        assertNotEquals(notFoundFlightTo, testFlightFinder);
    }
}