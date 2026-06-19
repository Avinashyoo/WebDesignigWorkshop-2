package com.student.studentapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    // Welcome Message

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Student Management REST API";
    }

    // GET Student Details

    @GetMapping("/student")
    public Student getStudent() {

        return new Student(
                101,
                "Rahul",
                "Computer Science");
    }

    // POST Student Details

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {

        System.out.println("Student Received");

        return student;
    }
}