package com.kodilla.collections.sets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTestSuite {

    private Order order = new Order("1/07/2020", "product", 2.5);

    @Test
    public void checkingGetQuantityOrder() {
        assertEquals(2.5, order.getQuantity());
    }

    @Test
    public void checkingGetProductNameOfOrder() {
        assertEquals("product", order.getProductName());
    }

    @Test
    public void checkingGetOrderNumberOfOrder() {
        assertEquals("1/07/2020", order.getOrderNumber());
    }
}
