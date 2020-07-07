package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "INVOICE")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String number;

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL)
    private Set<Item> itemsInvoice = new HashSet<>();

    public Invoice() {
    }

    public Invoice(String number, Set<Item> items) {
        this.number = number;
        this.itemsInvoice = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Set<Item> getItemsInvoice() {
        return itemsInvoice;
    }

    public void setItemsInvoice(Set<Item> itemsInvoice) {
        this.itemsInvoice = itemsInvoice;
    }
}
