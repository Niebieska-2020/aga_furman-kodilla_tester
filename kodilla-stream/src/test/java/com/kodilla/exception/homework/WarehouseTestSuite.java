package com.kodilla.exception.homework;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    @Test
    public void testGetOrderExists() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("5/5/2020"));

        // when
        Order result = warehouse.getOrder("5/5/2020");

        // then
        assertEquals(new Order("5/5/2020"), result);
    }

    @Test
    public void testGetOrderDoseNotExists() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        Set<Order> expectedOrder = new HashSet<>();
        expectedOrder.add(new Order("1/5/2020"));
        expectedOrder.add(new Order("2/5/2020"));
        expectedOrder.add(new Order("3/5/2020"));

        // when
        Order result = warehouse.getOrder("5/05/2020");

        // then
        assertNotEquals(expectedOrder, result);
    }
}