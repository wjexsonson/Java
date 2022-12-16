package ru.mirea.task12;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.ID > o2.ID) {
            return -1;
        }
        else if (o1.ID < o2.ID){
            return 1;
        }
        else {
            return 0;
        }
    }
}