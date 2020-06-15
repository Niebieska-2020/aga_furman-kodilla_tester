package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
@Scope("prototype")
public class Clock {

    private LocalTime currentTime;

    public LocalTime getCurrentTime() {
        DateTimeFormatter display = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime currentTime = LocalTime.now();
        System.out.println(display.format(currentTime));
        return currentTime;
    }
}
