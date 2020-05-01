package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    private Set<Book> bookstore;

    public BookManager() {
        this.bookstore = new HashSet<>();
    }

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        bookstore.add(book);
        return book;
    }

    public int getSize() {
        return bookstore.size();
    }
}
