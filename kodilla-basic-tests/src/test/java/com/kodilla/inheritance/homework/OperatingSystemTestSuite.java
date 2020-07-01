package com.kodilla.inheritance.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperatingSystemTestSuite {

    @Test
    public void checkingReleaseYearOfOperationSystem() {
        // given
        OperatingSystem operatingSystem = new Windows(2009);
        OperatingSystem operatingSystem1 = new Linux(1991);

        // then
        Assertions.assertEquals(2009, operatingSystem.getReleaseYear());
        Assertions.assertEquals(1991, operatingSystem1.getReleaseYear());
    }
}
