	package com.example.boot.Controller;

import com.example.boot.Model.Student;
import com.example.boot.Service.StudentService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //build create student rest api
    //https:localhost:8080/api/students
    @PostMapping("/savestudent")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    //http://localhost:8080/api/allstudents
    @GetMapping("/allstudents")
    public List<Student> getallStudents() {
        return studentService.getallStudents();
    }
    //http://localhost:8080/api/student/{id}
   @GetMapping("/student/{id}")
    public Optional<Student> getStudentByid(@PathVariable Long id) {
        return studentService.getByid(id);

    }
    //http://localhost:8080/api/student/delete/{id}
    @DeleteMapping("/student/delete/{id}")
    public String deleteByid(@PathVariable Long id){
    studentService.deleteByid(id);
    return "deleted the student details with the id="+id;
    }
}