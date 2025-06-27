package com.example.springbootmvc.entity;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @Column(name = "Student_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "First_Name")
    @NonNull
    private String firstName;
    @Column(name = "Last_Name")
    @NonNull
    private String lastName;
    @Column(name = "Email")
    @NonNull
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public Student(String firstName, String lastName, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
