package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        // Given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        // When
        int sumResult = calculator.sum(a, b);

        // Then
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        // Given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        // When
        int subtractResult = calculator.subtract(a, b);

        // Then
        assertEquals(-3, subtractResult);
    }
}
