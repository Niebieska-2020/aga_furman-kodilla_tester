package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    private Warehouse warehouse = new Warehouse();

    @Test
    public void testGetOrderExists() throws OrderDoesntExistException {
        // given
        warehouse.addOrder(new Order("5/5/2020"));

        // when
        Order result = warehouse.getOrder("5/5/2020");

        // then
        assertEquals("5/5/2020", result.getNumber());
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrderDoseNotExists() throws OrderDoesntExistException {
        // given
        warehouse.addOrder(new Order("3/5/2020"));
        // when
        warehouse.getOrder("5/05/2020");
    }
}