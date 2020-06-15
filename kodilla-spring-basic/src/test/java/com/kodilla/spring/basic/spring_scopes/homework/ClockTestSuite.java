package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootApplication
class ClockTestSuite {

    @Test
    public void shouldCreateDifferentTimes() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);
        Clock thirdBean = context.getBean(Clock.class);

        // when
        LocalTime clock1 = firstBean.getCurrentTime();
        LocalTime clock2 = secondBean.getCurrentTime();
        LocalTime clock3 = thirdBean.getCurrentTime();

        // then
        Assertions.assertNotEquals(clock1, clock2);
        Assertions.assertNotEquals(clock2, clock3);
        Assertions.assertNotEquals(clock3, clock1);
    }
}
