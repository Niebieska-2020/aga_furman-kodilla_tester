package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonBmiSource {

    public static Stream<Arguments> personList() {
        return Stream.of(
                Arguments.of(new Person(1.65, 40.0), "Very severely underweight"),
                Arguments.of(new Person(1.65,42.5), "Severely underweight"),
                Arguments.of(new Person(1.65, 65.0), "Normal (healthy weight)"),
                Arguments.of(new Person(1.65, 80.0), "Overweight"),
                Arguments.of(new Person(1.65, 92.0), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.65, 105.0), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.65, 120.0), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.65, 133.0), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.65, 160.0), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.65, 170.0), "Obese Class VI (Hyper Obese)")
        );
    }
}
