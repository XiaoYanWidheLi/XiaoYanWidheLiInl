package se.yrgo.domain;

import jakarta.persistence.*;
@Entity
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String enrollmentID;
    private String name;

    public Student(String name, String enrollmentID) {
        this.enrollmentID = enrollmentID;
        this.name = name;
    }

    public Student(String name)
    {
    	this.name = name;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }
    public String getEnrollmentID() {
        return enrollmentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
