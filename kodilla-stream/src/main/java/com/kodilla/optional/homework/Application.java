package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Piotr", new Teacher("Lucyna Migdał")));
        students.add(new Student("Agnieszka", new Teacher("Roman Ząbek")));
        students.add(new Student("Krzysztof", new Teacher(null)));
        students.add(new Student("Monika", new Teacher(null)));

        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", nauczyciel: " +
                    Optional.ofNullable(student.getTeacher()).map(teacher -> teacher.getName()).orElse("<undefined>"));
        }
    }
}
