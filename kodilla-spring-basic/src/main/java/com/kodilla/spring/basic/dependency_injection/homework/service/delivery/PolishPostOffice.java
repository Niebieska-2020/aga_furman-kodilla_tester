package com.kodilla.spring.basic.dependency_injection.homework.service.delivery;

import org.springframework.stereotype.Service;

@Service
public class PolishPostOffice implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 15) {
            System.out.println("Package too heavy. Use another delivery service.");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }
}
