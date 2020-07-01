package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTestSuite {

    @Test
    public void checkingGetFirstNamePrincipalIsCorrect() {
        // given
        Principal principal = new Principal("John", "Blue");

        // then
        assertEquals("John", principal.getFirstName());
    }

    @Test
    public void checkingGetLastNamePrincipalIsCorrect() {
        // given
        Principal principal = new Principal("John", "Blue");

        // then
        assertEquals("Blue", principal.getLastName());
    }
}
