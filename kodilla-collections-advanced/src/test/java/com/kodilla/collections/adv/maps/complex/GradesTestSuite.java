package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradesTestSuite {

    @Test
    public void checkingAverageOfGrades() {
        // given
        Grades grades = new Grades(3, 2, 5, 4);

        // then
        assertEquals(3.5, grades.getAverage(), 0.1);
    }
}
