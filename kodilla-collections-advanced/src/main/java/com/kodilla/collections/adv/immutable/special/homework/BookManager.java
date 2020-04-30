package com.kodilla.collections.adv.immutable.special.homework;

public class BookManager {

    public void createBook(String title, String author) {
        Book book = new BookHacked();
        BookHacked bookHacked = (BookHacked) book;
        bookHacked.modifyTitleAndAuthor();
    }
}
