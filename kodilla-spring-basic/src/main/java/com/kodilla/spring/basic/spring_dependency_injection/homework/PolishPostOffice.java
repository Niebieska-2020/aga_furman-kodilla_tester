package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PolishPostOffice implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight)  {
        if (weight > 15) {
            return false;
        }
        return true;
    }
}
