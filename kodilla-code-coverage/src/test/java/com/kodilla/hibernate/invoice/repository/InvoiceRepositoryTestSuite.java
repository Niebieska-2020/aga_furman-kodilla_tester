package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = NONE)
public class InvoiceRepositoryTestSuite {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private InvoiceRepository invoiceRepository;

    @After
    public void tearDown() throws Exception {
        entityManager.flush();
        entityManager.clear();
    }

    @Test
    public void testInvoiceRepositorySave() {
        // Given
        Product product1 = new Product("TV");
        Product product2 = new Product("Microwave");
        Product product3 = new Product("IPhone");
        Item item1 = new Item(new BigDecimal("1500"), 2, new BigDecimal("3000"), product1);
        Item item2 = new Item(new BigDecimal("299.99"), 1, new BigDecimal("299.99"), product2);
        Item item3 = new Item(new BigDecimal("2199.99"), 1, new BigDecimal("2199.99"), product3);
        Invoice invoice = new Invoice("1234/20", new HashSet<>(Arrays.asList(item1, item2, item3)));

        // When
        entityManager.persistAndFlush(invoice);
        Optional<Invoice> invoiceById = invoiceRepository.findById(invoice.getId());

        // Then
        assertTrue(invoiceById.isPresent());
        assertEquals("1234/20", invoiceById.get().getNumber());
        assertEquals(3, invoiceById.get().getItemsInvoice().size());
    }
}
