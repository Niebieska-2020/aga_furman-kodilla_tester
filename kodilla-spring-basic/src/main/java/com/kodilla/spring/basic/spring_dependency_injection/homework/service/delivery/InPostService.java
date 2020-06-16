package com.kodilla.spring.basic.spring_dependency_injection.homework.service.delivery;

import org.springframework.stereotype.Service;

@Service
public class InPostService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            return false;
        }
        return true;
    }
}
