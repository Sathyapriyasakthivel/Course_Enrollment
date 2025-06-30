package com.example.project1.controller;

import com.example.project1.model.Course;
import com.example.project1.model.Courseregistry;
import com.example.project1.service.courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:5500")
public class coursecontroller {

@Autowired
courseservice service;
        @GetMapping("/courses")
        public List<Course> display(){
           return service.display();
        }


        @GetMapping("courses/enrolledstudent")
    public List<Courseregistry> enrolledstudent(){
            return service.enrolledstudent();
        }

        @PostMapping("courses/register")
    public String register(@RequestParam("name") String name,
                           @RequestParam("email") String email,
                           @RequestParam("coursename") String coursename){
            service.register(name,email,coursename);
            return "successfully added";
        }
}
