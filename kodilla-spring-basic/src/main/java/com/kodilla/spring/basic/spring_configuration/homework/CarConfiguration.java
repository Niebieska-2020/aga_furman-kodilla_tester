package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalTime;
import java.time.MonthDay;

@Configuration
public class CarConfiguration {

    @Bean
    @Scope("prototype")
    public Car useCarDependingOnTheSeason(MonthDay monthDay, LocalTime hour) {
        if ((monthDay.isAfter(MonthDay.of(3, 20))) && (monthDay.isBefore(MonthDay.of(6,20)))) {
            return new Sedan(hour);
        } else if (monthDay.isAfter(MonthDay.of(6, 21)) && (monthDay.isBefore(MonthDay.of(9, 22)))) {
            return new Cabrio(hour);
        } else if (monthDay.isAfter(MonthDay.of(9, 23)) && (monthDay.isBefore(MonthDay.of(12, 22)))) {
            return new Sedan(hour);
        } else {
            return new SUV(hour);
        }
    }
}
