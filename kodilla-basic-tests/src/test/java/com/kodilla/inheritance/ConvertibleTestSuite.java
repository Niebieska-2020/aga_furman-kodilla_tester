package com.kodilla.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConvertibleTestSuite {

    private Convertible convertible;

    @Test
    public void checkingThatConvertibleIsACar() {
        assertTrue(convertible instanceof Car);
    }

    @Test
    public void checkingThatConvertibleHave4Wheels() {
        // Given
        convertible = new Convertible(4, 3);

        // Then
        assertEquals(4, convertible.getWheels());
    }

    @Test
    public void checkingThatConvertibleHave3Seats() {
        // Given
        convertible = new Convertible(4, 3);

        // Then
        assertEquals(3, convertible.getSeats());
    }
}
