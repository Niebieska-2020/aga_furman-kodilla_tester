package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"ach.TO_b2B", "Java-tester123", "00__00", "TTT.-.WWW"})
    public void shouldReturnTrueForValidateUsernameIsMoreThenThreeCharacters(String username) throws UserDoesntExist {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"!@#$%^&*()_+", "{[;:]}", "/|,<>?", "Zażółć", "gęślą", "jaźń"})
    public void shouldReturnFalseForValidateUserNameIfItUsesSpecialOrPolishCharacters(String username) throws UserDoesntExist {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfValidateUserNameIsEmpty(String username) throws UserDoesntExist {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"X", "QQ", "v", "yy", ".", "..", "_", "__", "-", "--"})
    public void shouldReturnFalseIfValidateUserNameHasLessThenThreeCharacters(String username) throws UserDoesntExist {
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ale@onet.pl", "234@wp.pl", "W.1-@3a.pl", "_@34.pl"})
    public void shouldReturnTrueIfValidateEmailUsedCorrectValue(String email) throws UserDoesntExist {
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abra.good", "abra@good", "2304@05958", "2304.05958", ".entery", "@entery", "@@@", "2@2", "END@END", "END", "@END", "Zażółć@r.pl"})
    public void shouldReturnFalseIfValidateEmailUsedWrongValue(String email) throws UserDoesntExist {
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfValidateEmailIsEmpty(String email) throws UserDoesntExist {
        assertFalse(userValidator.validateEmail(email));
    }
}