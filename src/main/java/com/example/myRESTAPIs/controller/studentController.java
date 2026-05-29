package example.myRESTAPIs.controller;

import example.myRESTAPIs.dto.StudentDto;
import example.myRESTAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class studentController{

    private final StudentService studentService;



    @GetMapping("/students")
    public List<StudentDto> getAllStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById(){
        return new StudentDto(4L, "sahil" , "sahil@gmail.com");
    }
}
