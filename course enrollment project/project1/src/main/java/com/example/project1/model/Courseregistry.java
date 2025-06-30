package com.example.project1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Courseregistry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String name;
    private String email;
    private String coursename;

    public Courseregistry(String name, String email, String coursename) {
        this.name = name;
        this.email = email;
        this.coursename = coursename;
    }
    public Courseregistry(){

    }
}
