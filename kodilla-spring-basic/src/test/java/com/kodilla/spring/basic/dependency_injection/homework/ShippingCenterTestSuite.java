package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void sendPackageByPolishPostOfficeAndSendTextSms() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection");
        ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);

        String actualResult = shippingCenter.sendPackage("Cracow, 12 Good Street", 12);
        String expectedResult = "Package delivered to: Cracow, 12 Good Street";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sendPackageByPolishPostOfficeAndSendTextSms2() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection");
        ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);

        String actualResult = shippingCenter.sendPackage("Cracow, 12 Good Street", 30);
        String expectedResult = "Package not delivered to: Cracow, 12 Good Street";
        assertEquals(expectedResult, actualResult);
    }
}
