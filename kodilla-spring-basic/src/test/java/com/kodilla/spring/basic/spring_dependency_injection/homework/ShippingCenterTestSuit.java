package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuit {

    @Test
    public void shouldReturnMessageSuccessWhenWeightIsCorrect() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String expectedResult = "Package delivered to: Cracow, 12 Cracow Street";

        // when
        String actualResult = bean.sendPackage("Cracow, 12 Cracow Street", 12);

        // then
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void shouldReturnMessageFailWhenWeightIsNotCorrect() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String expectedResult = "Package not delivered to: Cracow, 12 Cracow Street";

        // when
        String actualResult = bean.sendPackage("Cracow, 12 Cracow Street", 35);

        // then
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
