package com.kodilla.spring.basic.spring_configuration;

import com.kodilla.spring.basic.spring_configuration.homework.Car;
import com.kodilla.spring.basic.spring_configuration.homework.SUV;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CarConfigurationTestSuite {

    @Test
    public void shouldReturnTheCarDependingOnTheSeason() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("useCarDependingOnTheSeason");

        // when
        String carType = car.getCarType();
        List<String> possibleCarType = Arrays.asList("SUV", "Cabrio", "Sedan");

        // then
        System.out.println(carType);
        Assertions.assertTrue(possibleCarType.contains(carType));
    }

    @Test
    public void shouldReturnTrueWhenLightsAreTurnOn() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        SUV suv = (SUV) context.getBean("useHeadlightsDependingOnTheTimeOfDay");

        // when
        boolean turnOnAtSixAM = suv.hasHeadlightsTurnedOn(6);
        boolean turnOnAtEightPM = suv.hasHeadlightsTurnedOn(20);

        // then
        Assertions.assertTrue(turnOnAtSixAM);
        Assertions.assertTrue(turnOnAtEightPM);
    }

    @Test
    public void shouldReturnFalseWhenLightsAreTurnOff() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        SUV suv = (SUV) context.getBean("useHeadlightsDependingOnTheTimeOfDay");

        // when
        boolean turnOffAtSevenAM = suv.hasHeadlightsTurnedOn(7);
        boolean turnOffAtSevenPM = suv.hasHeadlightsTurnedOn(19);

        // then
        Assertions.assertFalse(turnOffAtSevenAM);
        Assertions.assertFalse(turnOffAtSevenPM);
    }
}
