package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        List<LocalDate> deadlineTask = TaskRepository.getTasks()
                .stream()
                .filter(dl -> dl.getDeadline().isAfter(currentDate))
                .map(Task :: getDeadline)
                .collect(Collectors.toList());

        System.out.println("Lista dat wszystkich zadań, których data jeszcze nie upłynęła: \n" + deadlineTask);
    }
}
