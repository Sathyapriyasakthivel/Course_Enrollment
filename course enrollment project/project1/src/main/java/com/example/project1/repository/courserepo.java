package com.example.project1.repository;

import com.example.project1.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courserepo extends JpaRepository<Course,String>{

}
