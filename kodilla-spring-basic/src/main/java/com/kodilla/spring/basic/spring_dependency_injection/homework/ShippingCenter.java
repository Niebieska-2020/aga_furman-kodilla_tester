package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.homework.service.delivery.PolishPostOfficeService;
import com.kodilla.spring.basic.spring_dependency_injection.homework.service.notification.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {

    private final PolishPostOfficeService deliveryService;
    private final SmsNotificationService notificationService;

    @Autowired
    public ShippingCenter(PolishPostOfficeService deliveryService, SmsNotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}
