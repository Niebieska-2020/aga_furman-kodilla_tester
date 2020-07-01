package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuckTestSuite {

    @Test
    public void checkGetNumberOfLegs() {
        // Given
        Duck duck = new Duck();

        // Then
        assertEquals(2, duck.getNumberOfLegs());
        assertNotEquals(4, duck.getNumberOfLegs());
    }
}
