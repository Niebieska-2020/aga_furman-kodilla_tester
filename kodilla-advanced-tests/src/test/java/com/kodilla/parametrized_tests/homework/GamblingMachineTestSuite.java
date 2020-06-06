package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {

    private final GamblingMachine testee = new GamblingMachine();

    @Test
    public void shouldReturnExceptionWhenUserNumbersIsEmpty() {
        assertThrows(InvalidNumbersException.class, () -> testee.howManyWins(new HashSet<>()));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/correctSetOfNumbers.csv")
    public void shouldReturnExceptionWhenSetOfNumbersIsCorrectForUserNumber(String numbers) throws InvalidNumbersException {
        // Given
        String[] split = numbers.split(" ");
        Set<Integer> integers = new HashSet<>();
        for (String string : split) {
            integers.add(Integer.valueOf(string));
        }

        // When Then
        testee.howManyWins(integers);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/uncorrectSetOfNumbers.csv")
    public void shouldReturnExceptionWhenSetOfNumbersIsUncorrectForUserNumber(String userNumbers) throws InvalidNumbersException {
        // Given
        String[] split = userNumbers.split(" ");
        Set<Integer> integers = new HashSet<>();
        for (String string : split) {
            integers.add(Integer.valueOf(string));
        }

        // When Then
        assertThrows(InvalidNumbersException.class, () -> {
            testee.howManyWins(integers);
        });
    }
}
