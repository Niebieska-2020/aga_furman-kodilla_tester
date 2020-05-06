package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("call to mother", LocalDate.of(2020, 05, 10), LocalDate.of(2020, 05, 15)));
        taskList.add(new Task("pay the bills", LocalDate.of(2020, 05, 8), LocalDate.of(2020, 05, 11)));
        taskList.add(new Task("buy a birthday present", LocalDate.of(2020, 04, 20), LocalDate.of(2020, 05, 02)));
        taskList.add(new Task("car inspection", LocalDate.of(2020, 04, 24), LocalDate.of(2020, 05, 07)));
        taskList.add(new Task("write a letter", LocalDate.of(2020, 05, 04), LocalDate.of(2020, 05, 05)));
        return taskList;
    }
}
