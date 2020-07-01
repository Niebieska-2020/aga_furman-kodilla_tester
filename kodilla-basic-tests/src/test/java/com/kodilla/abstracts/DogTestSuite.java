package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DogTestSuite {

    @Test
    public void checkGetNumberOfLegs() {
    // Given
    Dog dog = new Dog();

    // Then
    assertEquals(4, dog.getNumberOfLegs());
    assertNotEquals(2, dog.getNumberOfLegs());
    }
}
