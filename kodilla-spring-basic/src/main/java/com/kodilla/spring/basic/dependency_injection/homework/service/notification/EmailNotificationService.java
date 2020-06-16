package com.kodilla.spring.basic.dependency_injection.homework.service.notification;

import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {

    @Override
    public String success(String address) {
        return "Package delivered to: " + address;
    }

    @Override
    public String fail(String address) {
        return "Package not delivered to: " + address;
    }
}
