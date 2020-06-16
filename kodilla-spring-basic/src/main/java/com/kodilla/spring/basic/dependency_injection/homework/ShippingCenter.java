package com.kodilla.spring.basic.dependency_injection.homework;

import com.kodilla.spring.basic.dependency_injection.homework.service.delivery.PolishPostOffice;
import com.kodilla.spring.basic.dependency_injection.homework.service.notification.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {

//    1. Wstrzykiwanie przez pole
//    @Autowired
//    private DeliveryService deliveryService;
//
//    @Autowired
//    private NotificationService notificationService;

//    2. Wstrzykiwanie przez setter
//    @Autowired
//    public void setNotificationService(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }
//
//    @Autowired
//    public void setDeliveryService(DeliveryService deliveryService) {
//        this.deliveryService = deliveryService;
//    }

    //    3. Wstrzykiwanie przez konstruktor
    private PolishPostOffice deliveryService;
    private SmsNotificationService notificationService;

    @Autowired
    public ShippingCenter(PolishPostOffice deliveryService, SmsNotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        } else {
            return notificationService.fail(address);
        }
    }
}
