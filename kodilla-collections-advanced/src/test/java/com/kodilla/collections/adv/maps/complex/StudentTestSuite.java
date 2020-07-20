package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTestSuite {

    @Test
    public void returnStudentFirstNameIfItExists() {
        // given
        Student student = new Student("John", "Blue");

        // then
        assertEquals("John", student.getFirstName());
    }

    @Test
    public void returnStudentLastNameIfItExists() {
        // given
        Student student = new Student("John", "Blue");

        // then
        assertEquals("Blue", student.getLastName());
    }
}
