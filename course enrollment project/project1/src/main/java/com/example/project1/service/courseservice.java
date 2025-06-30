package com.example.project1.service;

import com.example.project1.model.Course;
import com.example.project1.model.Courseregistry;
import com.example.project1.repository.Courseregistryrepo;
import com.example.project1.repository.courserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class courseservice {
    @Autowired
    courserepo repo;
    @Autowired
    Courseregistryrepo regrepo;
    public List<Course> display() {

        return repo.findAll();
    }

    public List<Courseregistry> enrolledstudent() {
          return regrepo.findAll();
    }

    public void register(String name, String email, String coursename) {
        Courseregistry course1 = new Courseregistry(name,email,coursename);
        regrepo.save(course1);
    }
}
