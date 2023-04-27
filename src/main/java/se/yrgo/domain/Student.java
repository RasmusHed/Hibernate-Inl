package se.yrgo.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "name:" + name;
    }
}
