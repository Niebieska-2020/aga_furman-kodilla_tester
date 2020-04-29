package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> students = new ArrayList();

    public School(String schoolName, Integer... students) {
        this.schoolName =schoolName;

        for (Integer student : students) {
            this.students.add(student);
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getCountStudent() {
        int sum = 0;
        for(Integer student : students) {
            sum += students.get(student);
         }
        return sum;
    }
}
