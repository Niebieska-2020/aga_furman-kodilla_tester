package com.kodilla.collections.sets.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StampTestSuite {

    private Stamp stamp = new Stamp("Usual", "L", true);

    @Test
    void checkingGetStampName() {
         assertEquals("Usual", stamp.getStampName());
    }

    @Test
    public void checkingGetSizeStamp() {
        assertEquals("L", stamp.getSizeStamp());
    }

    @Test
    public void returnTrueIfStampIsIndicate() {
        assertTrue(stamp.isIndicate());
    }
}
