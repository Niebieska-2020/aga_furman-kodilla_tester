package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> returnTheListOfOrdersFromTwoDates(LocalDate date1, LocalDate date2) {
        return orders.stream()
                    .filter(t -> t.getDate().isAfter(date1) && t.getDate().isBefore(date2))
                    .collect(Collectors.toList());
    }

    public List<Order> getOrdersWithinValueRange(double value1, double value2) {
         return orders.stream()
                    .filter(order -> order.getValue() >= value1 && order.getValue() <= value2)
                    .collect(Collectors.toList());
    }

    public double getSumOrdersValue() {
        return orders.stream()
                .map(v -> v.getValue())
                .mapToDouble(v -> v)
                .sum();
    }

    public int getOrderSize() {
        return orders.size();
    }
}
