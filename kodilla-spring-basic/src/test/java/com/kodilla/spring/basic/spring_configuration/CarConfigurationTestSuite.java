package com.kodilla.spring.basic.spring_configuration;

import com.kodilla.spring.basic.spring_configuration.homework.Cabrio;
import com.kodilla.spring.basic.spring_configuration.homework.Car;
import com.kodilla.spring.basic.spring_configuration.homework.SUV;
import com.kodilla.spring.basic.spring_configuration.homework.Sedan;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootApplication
public class CarConfigurationTestSuite {
    @Test
    public void shouldReturnSedanWithLightsTurnedOnWhenSpringAndAtNight() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        // when
        Car car = (Car) context.getBean("useCarDependingOnTheSeason", MonthDay.of(3, 21), LocalTime.of(6, 0));

        // then
        assertTrue(car instanceof Sedan);
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnCabrioWithLightsTurnedOffWhenSummerAndAtDay() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        // when
        Car car = (Car) context.getBean("useCarDependingOnTheSeason", MonthDay.of(6, 22), LocalTime.of(19, 1));

        // then
        assertTrue(car instanceof Cabrio);
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanWithLightsTurnedOffWhenAutumnAndAtDay() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        // when
        Car car = (Car) context.getBean("useCarDependingOnTheSeason", MonthDay.of(9, 24), LocalTime.of(7, 1));

        // then
        assertTrue(car instanceof Sedan);
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSUVWithLightsTurnedOnWhenWinterAndAtNight() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        // when
        Car car = (Car) context.getBean("useCarDependingOnTheSeason", MonthDay.of(12, 23),LocalTime.of(20, 1));

        // then
        assertTrue(car instanceof SUV);
        assertTrue(car.hasHeadlightsTurnedOn());
    }
}
