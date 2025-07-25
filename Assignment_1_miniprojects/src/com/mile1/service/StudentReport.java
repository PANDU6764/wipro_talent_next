package com.mile1.service;


import com.mile1.bea.Student;
import com.mile1.exception.*;
public class StudentReport {

    public String validate(Student s)
        throws NullStudentObjectException, NullNameException, NullMarksArrayException {
        if (s == null) throw new NullStudentObjectException();
        if (s.getName() == null) throw new NullNameException();
        if (s.getMarks() == null) throw new NullMarksArrayException();
        return "VALID";
    }

    public String findGrades(Student studentObject) {
        int[] marks = studentObject.getMarks();
        for (int m : marks) {
            if (m < 35) {
                studentObject.setGrade("F");
                return "F";
            }
        }
        int sum = 0;
        for (int m : marks) sum += m;

        String grade;
        if (sum < 150) grade = "C";
        else if (sum < 200) grade = "B";
        else if (sum < 250) grade = "A";
        else grade = "A+";

        studentObject.setGrade(grade);
        return grade;
    }
}

