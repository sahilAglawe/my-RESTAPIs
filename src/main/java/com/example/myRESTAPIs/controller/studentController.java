package example.myRESTAPIs.controller;

import example.myRESTAPIs.dto.AddStudentRequestDto;
import example.myRESTAPIs.dto.StudentDto;
import example.myRESTAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class studentController{

    private final StudentService studentService;

    @GetMapping("/students")
    public List<StudentDto> getAllStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public StudentDto getStudentById(@PathVariable Long id){
         return  studentService.getStudentById(id);
    }

    @PostMapping("/students")
    public ResponseEntity<StudentDto> createStudent(@RequestBody AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }
}
