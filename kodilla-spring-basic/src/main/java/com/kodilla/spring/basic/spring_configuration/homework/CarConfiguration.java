package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarConfiguration {

    @Bean
    public Car useCarDependingOnTheSeason() {
        Random random = new Random();
        int season = random.nextInt(4);
    if (season == 0) {
        System.out.println("This is Spring. Today you will use " + Car.class.getTypeName() + ".");
        return new Sedan();
    } else if (season == 1) {
        System.out.println("This is Summer. Today you will use " + Car.class.getTypeName() + ".");
        return new Cabrio();
    } else if (season == 2) {
            System.out.println("This is Autumn. Today you will use " + Car.class.getTypeName() + ".");
            return new Sedan();
    } else {
            System.out.println("This is Winter. Today you will use " + Car.class.getTypeName() + ".");
            return new SUV();
        }
    }

    @Bean
    public SUV useHeadlightsDependingOnTheTimeOfDay() {
        return new SUV();
    }
}
