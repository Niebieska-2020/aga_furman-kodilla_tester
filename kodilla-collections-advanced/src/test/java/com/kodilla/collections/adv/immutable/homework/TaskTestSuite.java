package com.kodilla.collections.adv.immutable.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTestSuite {

    @Test
    void checkingTitleOfTask() {
        // given
        Task task = new Task("testing", 5);

        // then
        assertEquals("testing", task.getTitle());
    }

    @Test
    void checkingDurationOfTask() {
        // given
        Task task = new Task("testing", 5);

        // then
        assertEquals(5, task.getDuration());
    }
}
