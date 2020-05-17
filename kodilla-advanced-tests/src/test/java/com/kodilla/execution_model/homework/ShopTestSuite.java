package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ShopTestSuite {

    private Shop testee = new Shop();

    @Test
    public void shouldAddOrderToShop() {
        // given
        int sizeBeforeAdding = testee.getOrderSize();
        Order order1 = new Order(50.0, LocalDate.of(2020, 06, 05), "agnes");

        // when
        testee.addOrder(order1);

        // then
        assertEquals(0, sizeBeforeAdding);
        assertEquals(1, testee.getOrderSize());
    }

    @Test
    public void shouldReturnListOfOrdersFromTwoDates() {
        // given
        testee.addOrder(new Order(75.0, LocalDate.of(2020, 06, 01), "john"));
        testee.addOrder(new Order(150.0, LocalDate.of(2020, 01, 21), "user123"));
        testee.addOrder(new Order(175.5, LocalDate.of(2020, 02, 14), "valeria"));

        // when
        List<Order> resultList = testee.returnTheListOfOrdersFromTwoDates(LocalDate.of(2020, 01, 01), LocalDate.of(2020, 02, 21));

        // then
        assertEquals(2, resultList.size());
    }

    @Test
    public void shouldReturnEmptyListOfOrdersFromTwoDatesWhenTheDataDoesNotExist() {
        // given
        testee.addOrder(new Order(75.0, LocalDate.of(2020, 06, 01), "john"));
        testee.addOrder(new Order(150.0, LocalDate.of(2020, 01, 21), "user123"));
        testee.addOrder(new Order(175.5, LocalDate.of(2020, 02, 14), "valeria"));

        // when
        List<Order> emptyList = testee.returnTheListOfOrdersFromTwoDates(LocalDate.of(2020, 01, 01), LocalDate.of(2020, 01, 20));

        // then
        assertEquals(Collections.emptyList(), emptyList);
    }

    @Test
    public void shouldReturnListOfOrdersFromTwoValues() {
        // given
        testee.addOrder(new Order(75.0, LocalDate.of(2020, 06, 01), "john"));
        testee.addOrder(new Order(150.0, LocalDate.of(2020, 01, 21), "user123"));
        testee.addOrder(new Order(175.5, LocalDate.of(2020, 02, 14), "valeria"));

        // when
        List<Order> ordersList = testee.getOrdersWithinValueRange(25.0, 100.0);

        // then
        assertEquals(1, ordersList.size());
    }

    @Test
    public void shouldReturnNumbersOfOrders() {
        // given
        testee.addOrder(new Order(75.0, LocalDate.of(2020, 06, 01), "john"));
        testee.addOrder(new Order(150.0, LocalDate.of(2020, 01, 21), "user123"));
        testee.addOrder(new Order(175.5, LocalDate.of(2020, 02, 14), "valeria"));

        // then
        assertEquals(3, testee.getOrderSize());
    }

    @Test
    public void returnSumOfValuesAllOrders() {
        // given
        testee.addOrder(new Order(75.0, LocalDate.of(2020, 06, 01), "john"));
        testee.addOrder(new Order(150.0, LocalDate.of(2020, 01, 21), "user123"));
        testee.addOrder(new Order(175.5, LocalDate.of(2020, 02, 14), "valeria"));

        // when
        double result = testee.getSumOrdersValue();

        // then
        assertEquals(400.5, testee.getSumOrdersValue(), 0.01);
    }
}
