package com.kodilla.parametrized_tests.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public boolean validateUsername(String username) throws UserDoesntExist {
     try {
         return username.matches("^[a-zA-Z0-9._-]{3,}$");
     } catch (Exception e) {
         System.out.println("The username is wrong. Enter a minimum 3 character name, which includes: lower case letters, " +
                 "upper case letters, numbers, dot, dash, underline.");
     }
        return false;
    }

    public boolean validateEmail(String email) throws UserDoesntExist {
        try {
        if (null != email) {
            String regex = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
            System.out.println("The email address is correct.");
        } catch (Exception e) {
            System.out.println("The email address is wrong. Enter email address which includes: lower case letters, " +
                    "upper case letters, number, @, dot, dash, underline.");
        }
        return false;
    }
}
