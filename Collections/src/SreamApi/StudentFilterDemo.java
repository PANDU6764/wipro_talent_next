package SreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Student {
    int rollNo;
    String name;
    int mark;

    
    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    
    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + mark);
    }
}


public class StudentFilterDemo {

    public static void main(String[] args) {

        
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Alice", 65));
        studentList.add(new Student(2, "Bob", 45));
        studentList.add(new Student(3, "Charlie", 78));
        studentList.add(new Student(4, "David", 33));
        studentList.add(new Student(5, "Eva", 55));

        
        List<Student> clearedStudents = studentList.stream()
                .filter(student -> student.mark >= 50)
                .collect(Collectors.toList());

        
        int count = clearedStudents.size();
        System.out.println("Students who cleared the test (marks >= 50):");
        for (Student s : clearedStudents) {
            s.display();
        }

        
        System.out.println("Total students who cleared the test: " + count);
    }
}

