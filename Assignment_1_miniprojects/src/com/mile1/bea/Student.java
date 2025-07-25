package com.mile1.bea;

public class Student {
    private String name;
    private int[] marks;
    private String grade;

    public Student() {}

    public Student(String name, int[] marks, String grade) {
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }

    public String getName() { return name; }
    public int[] getMarks() { return marks; }
    public String getGrade() { return grade; }

    public void setName(String name) { this.name = name; }
    public void setMarks(int[] marks) { this.marks = marks; }
    public void setGrade(String grade) { this.grade = grade; }
}


