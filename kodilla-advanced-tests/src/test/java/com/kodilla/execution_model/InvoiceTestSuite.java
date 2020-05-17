package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item product1 = new Item("product1", 5.50);
    Item product2 = new Item("product2", 10.00);
    Item product3 = new Item("product3", 5.15);

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(product1);
        invoice.addItem(product2);
        invoice.addItem(product3);
    }

    @Test
    public void shouldAddItemsToInvoice() {
        // When
        int numberOfItems = invoice.getSize();

        // Then
        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldGetExistingItem() {
        // When
        Item result = invoice.getItem(1);

        // Then
        assertEquals("product2", result.getName());
        assertEquals(10.00, result.getPrice(), 0.01);
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        // When
        Item result = invoice.getItem(-2);

        // Then
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        // When
        Item result = invoice.getItem(4);

        // Then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {
        // When
        invoice.clear();

        // Then
        assertEquals(0, invoice.getSize());
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}
