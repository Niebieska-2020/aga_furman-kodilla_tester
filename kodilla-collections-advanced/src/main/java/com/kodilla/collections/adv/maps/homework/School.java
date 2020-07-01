package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> students = new ArrayList();

    public School(String schoolName, Integer... students) {
        this.schoolName = schoolName;
        this.students.addAll(Arrays.asList(students));
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getCountStudent() {
        return students.stream().reduce(Integer::sum).orElse(0);
    }

}
