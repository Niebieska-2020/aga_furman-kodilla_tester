package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();
        Principal director1 = new Principal("John", "White");
        Principal director2 = new Principal("Agnes", "Blue");
        Principal director3 = new Principal("Michael", "Angel");

        School primary = new School("Primary school", 20, 30, 15, 10);
        School secondary = new School("Secondary school", 15, 25, 16);
        School high = new School("High school", 18, 23, 17);

        schoolDirectory.put(director1, primary);
        schoolDirectory.put(director2, secondary);
        schoolDirectory.put(director3, high);

        for (Map.Entry<Principal, School> principalSchoolEntry: schoolDirectory.entrySet()) {
            System.out.println("The principal of the school " + principalSchoolEntry.getKey().getFirstName() + " "
                    + principalSchoolEntry.getKey().getLastName() + " of the school " + principalSchoolEntry.getValue().getSchoolName() +
                    " with the total number of pupils " + principalSchoolEntry.getValue().getCountStudent() +
                    " in the classes");
        }
    }
}
