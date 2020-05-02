package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTestSuit {

    @Test
    public void findFlightsFrom() {
        // given
        FlightFinder flightFinder = new FlightFinder(FlightRepository.getFlightsTable());
        List<Flight> resultFlightFrom = flightFinder.findFlightsFrom("Warszawa");

        // when
        List<Flight> expectedFlightsList = new ArrayList<>();
        expectedFlightsList.add(new Flight("Warszawa", "Krakow"));
        expectedFlightsList.add(new Flight("Warszawa", "Gdansk"));

        // then
        assertEquals(expectedFlightsList, resultFlightFrom);
    }

    @Test
    public void testFindFlightFromWarszawa() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        // when
        List<Flight> foundFlightFrom = testFlightFinder.findFlightsFrom("Warszawa");

        // then
        for (Flight flight : foundFlightFrom) {
            assertEquals("Warszawa", flight.getDeparture());
        }
    }

    @Test
    public void testFindFlightToWhenDepartureIsWrongWritten() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        // when
        List<Flight> foundFlightFrom = testFlightFinder.findFlightsFrom("Warsszawa");

        // then
        for (Flight flight : foundFlightFrom) {
            Assertions.assertNotSame("Warsszawa", flight.getDeparture());
        }
    }

    @Test
    public void checkNotFindFlightToWhenDepartureIsEmpty() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        // when
        List<Flight> notFoundFlightFrom = testFlightFinder.findFlightsFrom(" ");

        // then
        for (Flight flight : notFoundFlightFrom) {
            assertEquals(" ", flight.getDeparture());
        }
    }

    @Test
    public void checkNotFindFlightToWhenDepartureIsNull() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        // when
        List<Flight> notFoundFlightFrom = testFlightFinder.findFlightsFrom("null");

        // then
        for (Flight flight : notFoundFlightFrom) {
            assertNull(notFoundFlightFrom, flight.getDeparture());
        }
    }

    @Test
    public void findFlightsTo() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());
        List<Flight> resultFlightTo = testFlightFinder.findFlightsTo("Krakow");

        // when
        List<Flight> expectedFlightsList = new ArrayList<>();
        expectedFlightsList.add(new Flight("Warszawa", "Krakow"));
        expectedFlightsList.add(new Flight("Gdansk", "Krakow"));

        // then
        assertEquals(expectedFlightsList, resultFlightTo);
    }

    @Test
    public void testFindFlightToWarszawa() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        // when
        List<Flight> foundFlightTo = testFlightFinder.findFlightsTo("Warszawa");

        // then
        for (Flight flight : foundFlightTo) {
            assertEquals("Warszawa", flight.getArrival());
        }
    }

    @Test
    public void testFindFlightToWhenArrivalIsWrongWritten() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        // when
        List<Flight> foundFlightTo = testFlightFinder.findFlightsTo("Warsszawa");

        // then
        for (Flight flight : foundFlightTo) {
            assertNotSame("Warsszawa", flight.getArrival());
        }
    }

    @Test
    public void checkNotFindFlightToWhenArrivalIsEmpty() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        // when
        List<Flight> notFoundFlightTo = testFlightFinder.findFlightsTo(" ");

        // then
        for (Flight flight : notFoundFlightTo) {
            assertEquals(" ", flight.getArrival());
        }
    }

    @Test
    public void checkNotFindFlightToWhenArrivalIsNull() {
        // given
        FlightFinder testFlightFinder = new FlightFinder(FlightRepository.getFlightsTable());

        // when
        List<Flight> notFoundFlightTo = testFlightFinder.findFlightsTo("null");

        // then
        for (Flight flight : notFoundFlightTo) {
            assertNotEquals(notFoundFlightTo, flight.getArrival());
        }
    }
}