package com.mile1.main;

import com.mile1.bea.Student;
import com.mile1.service.*;
import com.mile1.exception.*;

@SuppressWarnings("unused")
public class StudentMain {
    static Student data[] = new Student[4];

    public StudentMain() {
        data[0] = new Student("Sekar", new int[]{85, 75, 95}, null);
        data[1] = new Student(null, new int[]{11, 22, 33}, null);
        data[2] = null;
        data[3] = new Student("Manoj", null, null);
    }

    public static void main(String[] args) {
		StudentMain mainObj = new StudentMain();
        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        for (Student s : data) {
            try {
                String validStatus = report.validate(s);
                if ("VALID".equals(validStatus)) {
                    String grade = report.findGrades(s);
                    System.out.println("Grade = " + grade);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Null marks arrays: " + service.findNumberOfNullMarksArray(data));
        System.out.println("Null names: " + service.findNumberOfNullName(data));
        System.out.println("Null student objects: " + service.findNumberOfNullObjects(data));
    }
}
