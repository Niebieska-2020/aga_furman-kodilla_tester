package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTestSuite {

    @Test
    public void checkingPrincipalCountingMethodInSchool() {
       // given
        School school = new School("School1",  12, 30, 40);

        // then
        assertEquals(82, school.getCountStudent());
    }

    @Test
    public void checkGetSchoolNameIsCorrect() {
        // given
        School school = new School("School1",  12, 30, 40);

        // then
        assertEquals("School1", school.getSchoolName());
    }
}
