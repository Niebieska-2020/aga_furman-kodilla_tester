package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"ach.TO_b2B", "TTT.-.WWW00__00"})
    public void shouldReturnTrueForValidateUsernameIsMoreThenThreeCharacters(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"!@#$%^&*()_+/|,<>?{[;:]}", "Zażółć gęślą jaźń"})
    public void shouldReturnFalseForValidateUserNameIfItUsesSpecialOrPolishCharacters(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"X", ".."})
    public void shouldReturnFalseIfValidateUserNameHasLessThenThreeCharacters(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseWhenUsernameIsEmpty(String username) {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @NullSource
    public void shouldThrowExceptionWhenUsernameIsNull(String username) {
        assertThrows(NullPointerException.class, () -> userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ale@onet.pl", "234@wp.pl", "W.1-@3a.pl", "_@34.pl"})
    public void shouldReturnTrueIfValidateEmailUsedCorrectValue(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "abra.good", "abra7@good5", ".entery", "@entery", "@@@", "2@2", "Zażółć@r.pl"})
    public void shouldReturnFalseIfValidateEmailUsedWrongValue(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @NullSource
    public void shouldThrowExceptionWhenEmailIsNull(String email) {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseWhenEmailIsEmpty(String email) {
        assertTrue(userValidator.validateEmail(email));
    }
}
