package com.example.project1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {
    @Id
    private String courseid;
    private String coursename;
    private String trainer;
    private int durationinweek;



}
