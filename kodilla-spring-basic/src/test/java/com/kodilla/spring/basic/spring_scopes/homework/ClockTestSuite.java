package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
class ClockTestSuite {

    @Test
    public void shouldCreateDifferentTimes() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock clock1 = context.getBean(Clock.class);
        Clock clock2 = context.getBean(Clock.class);
        Clock clock3 = context.getBean(Clock.class);

        // then
        Assertions.assertNotEquals(clock1, clock2);
        Assertions.assertNotEquals(clock2, clock3);
        Assertions.assertNotEquals(clock3, clock1);
    }
}
