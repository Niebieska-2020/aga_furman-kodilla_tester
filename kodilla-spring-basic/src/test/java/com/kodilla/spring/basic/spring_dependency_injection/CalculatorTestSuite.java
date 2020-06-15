package com.kodilla.spring.basic.spring_dependency_injection;

import com.kodilla.spring.basic.spring_dependency_injection.homework.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    ApplicationContext context =  new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldAdd() {
        // when
        double result = bean.add(6.2, 3.3);

        // then
        Assertions.assertEquals(9.5, result);
    }

    @Test
    public void shouldSubtract() {
        // when
        double result = bean.subtract(6.0,3.5);

        // then
        Assertions.assertEquals(2.5, result);
    }

    @Test
    public void shouldMultiply() {
        // when
        double result = bean.multiply(2.0, 3.0);

        // then
        Assertions.assertEquals(6.0, result);
    }

    @Test
    public void shouldDivide() {
        // when
        double result = bean.divide(15.0, 5.0);

        // then
        Assertions.assertEquals(3.0, result);
    }

    @Test
    public void shouldRaiseExceptionWhenDividingByZero() {
        Assertions.assertThrows(IllegalStateException.class, () -> {
            bean.divide(10, 0);
        });
    }
}
