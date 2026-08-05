package com.umb.taller.domain;

public class Student extends Person {
    private String studentId;

    public Student() {
        super();
    }

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String displayRole() {
        return "Student[id=" + studentId + ", name=" + getName() + ", age=" + getAge() + "]";
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}