package se.yrgo.domain;

import jakarta.persistence.*;

import java.util.*;
@Entity
public class Tutor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String tutorId;
    private String name;
    private int salary;
    @OneToMany
    @MapKey(name="enrollmentID")
    @JoinColumn(name="TUTOR_FK")
    private List<Student> teachingGroup;
    public Tutor(String tutorId, String name, int salary) {

        this.tutorId = tutorId;
        this.name = name;
        this.salary = salary;
        this.teachingGroup =  new ArrayList<Student>();
    }
    public Tutor() {
    }
    public void addStudentToTeachingGroup(Student newStudent) {
        this.teachingGroup.add(newStudent);
    }
    public List<Student> getTeachingGroup() {
        List<Student>unmodifiable= Collections.unmodifiableList(this.teachingGroup);
        return unmodifiable;
    }
        public String getTutorId() {
        return tutorId;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "tutor{" +
                "name='" + name + '\'' +
                '}';
    }
}
