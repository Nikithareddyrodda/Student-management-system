package com.example.boot.Model;


import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Column(name= "firstName" , nullable = false)
    public String firstName;
    @Column(name = "lastName")
    public String lastName;
    @Column(name = "email")
    public String  email;
}
