package com.kodilla.collections.adv.immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookHackedTestSuite {

    @Test
    public void testBookHacked() {
        // given
        Book book = new BookHacked("Radoslaw Smilgin", "Zawod tester");

        // when
        BookHacked bookHacked = (BookHacked) book;
        bookHacked.modifyTitle("Zawod");

        // then
        assertEquals("Zawod", bookHacked.getTitle());
    }
}
