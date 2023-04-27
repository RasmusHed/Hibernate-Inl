package se.yrgo.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name="TUTOR")
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tutorId;
    private String name;
    private int salary;
    @OneToMany
    private List<Student> teachingGroup;

    public Tutor(){}
    public Tutor(String tutorId, String name, int salary) {
        this.tutorId = tutorId;
        this.name = name;
        this.salary = salary;
        this.teachingGroup = new ArrayList<Student>();
    }
    public String getTutorId() {
        return tutorId;
    }

    public String getName() {
        return name;
    }

    public void addStudentToTeachingGroup(Student newStundet) {
        this.teachingGroup.add(newStundet);
    }

    public List<Student> getTeachingGroup() {
        return Collections.unmodifiableList(this.teachingGroup);
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "id=" + id +
                ", tutorId='" + tutorId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", teachingGroup=" + teachingGroup +
                '}';
    }
}
