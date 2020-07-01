package com.kodilla.collections.adv.immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTestSuite {

    @Test
    public void checkingAuthorOfBook() {
        // given
        Book book = new Book("Radoslaw Smilgin", "Zawod tester");

        // then
        assertEquals("Radoslaw Smilgin", book.getAuthor());
    }

    @Test
    public void checkingTitleOfBook() {
        // given
        Book book = new Book("Radoslaw Smilgin", "Zawod tester");

        // then
        assertEquals("Zawod tester", book.getTitle());
    }
}
