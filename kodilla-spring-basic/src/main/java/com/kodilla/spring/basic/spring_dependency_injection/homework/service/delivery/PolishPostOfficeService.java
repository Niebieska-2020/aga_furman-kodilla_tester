package com.kodilla.spring.basic.spring_dependency_injection.homework.service.delivery;

import org.springframework.stereotype.Component;

@Component
public class PolishPostOfficeService implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight)  {
        if (weight > 15) {
            return false;
        }
        return true;
    }
}
