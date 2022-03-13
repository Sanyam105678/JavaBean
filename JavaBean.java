package com.company;

public class JavaBean {

    private int rollNumber;
    private int marks;
    private String studentName;

    public JavaBean() {}
    public JavaBean(int rollNumber, int marks, String studentName) {
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}