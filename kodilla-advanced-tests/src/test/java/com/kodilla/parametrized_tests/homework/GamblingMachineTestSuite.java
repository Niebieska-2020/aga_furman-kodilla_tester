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
    @CsvFileSource(resources = "/exceptionCorrectSetOfNumbers.csv")
    public void shouldReturnTrueWhenSetOfNumbersIsCorrectForUserNumber(String userNumbers, int expected) throws InvalidNumbersException {
        String[] split = userNumbers.split(",");
        Set<Integer> integers = new HashSet<>();
        for (String string : split) {
            integers.add(Integer.valueOf(string));
        }
        assertThrows(InvalidNumbersException.class, () -> {
            testee.howManyWins(integers);
        });
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/exceptionUncorrectSetOfNumbers.csv")
    public void shouldReturnFalseWhenSetOfNumbersIsUncorrectForUserNumber(String userNumbers, int expected) throws InvalidNumbersException {
        String[] split = userNumbers.split(",");
        Set<Integer> integers = new HashSet<>();
        for (String string : split) {
            integers.add(Integer.valueOf(string));
        }
        assertThrows(InvalidNumbersException.class, () -> {
            testee.howManyWins(integers);
        });
    }
}
