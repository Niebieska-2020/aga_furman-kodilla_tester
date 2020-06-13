package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void sendPackageByPolishPostOfficeAndSendTextSms() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String actualResult = bean.sendPackage("Cracow, 12 Good Street", 12);
        String expectedResult = "Package delivered to: Cracow, 12 Good Street";
        Assertions.assertEquals(expectedResult, actualResult);
    }


}
