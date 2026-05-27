package com.example.myRESTAPIs.controller;

import com.example.myRESTAPIs.DTO.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(4L, "sahil", "sahil@gmail.com");
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById(){
        return new StudentDto(4L, "sahil", "sahil@gmail.com");
    }
}
