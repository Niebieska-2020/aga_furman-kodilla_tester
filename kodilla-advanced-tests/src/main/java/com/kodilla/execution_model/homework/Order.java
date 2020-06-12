package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private double value;
    private LocalDate date;
    private String loginUser;

    public Order(double value, LocalDate date, String loginUser) {
        this.value = value;
        this.date = date;
        this.loginUser = loginUser;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLoginUser() {
        return loginUser;
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date=" + date +
                ", loginUser='" + loginUser + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(order.value, value) == 0 &&
                date.equals(order.date) &&
                loginUser.equals(order.loginUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, date, loginUser);
    }
}
