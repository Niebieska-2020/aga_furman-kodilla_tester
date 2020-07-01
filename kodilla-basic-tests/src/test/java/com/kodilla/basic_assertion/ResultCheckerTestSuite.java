package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResultCheckerTestSuite {

    @Test
    public void checkAssertEqualsMethod() {
        assertTrue(ResultChecker.assertEquals(1, 1), String.valueOf(true));
    }
}
