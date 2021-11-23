package ru.mirea.task12.var2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA {

    public static void main(String[] params) {
        ArrayList<SortingStudentsByGPA.Student> studentList = new ArrayList<>();

        studentList.add(new SortingStudentsByGPA.Student("Pupkin", 2));
        studentList.add(new SortingStudentsByGPA.Student("Pipkin", 4));
        studentList.add(new SortingStudentsByGPA.Student("Papkin", 3));

        Collections.sort(studentList, new Comparator<SortingStudentsByGPA.Student>() {

            public int compare(SortingStudentsByGPA.Student o1, SortingStudentsByGPA.Student o2) {
                return o2.mark - o1.mark;
            }
        });
        for (SortingStudentsByGPA.Student student:studentList){
            System.out.println(student);
        }
    }

    static class Student {
        String name;
        int mark;

        public Student (String name, int mark) {
            this.name=name;
            this.mark=mark;
        }

        public String toString() {
            return "Student: " + "name='" + name + ", mark=" + mark;
        }
    }
}