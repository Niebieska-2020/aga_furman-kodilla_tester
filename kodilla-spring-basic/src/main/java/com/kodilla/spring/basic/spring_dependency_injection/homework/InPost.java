package com.kodilla.spring.basic.spring_dependency_injection.homework;

public class InPost implements DeliveryService {

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            return false;
        }
        return true;
    }
}
