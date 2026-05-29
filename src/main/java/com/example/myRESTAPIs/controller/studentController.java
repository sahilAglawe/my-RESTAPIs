package example.myRESTAPIs.controller;

import example.myRESTAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;

public class studentController{

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(4L, "sahil" , "sahil@gmail.com");
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById(){
        return new StudentDto(4L, "sahil" , "sahil@gmail.com");
    }
}
