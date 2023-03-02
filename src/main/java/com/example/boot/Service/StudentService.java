package com.example.boot.Service;

import com.example.boot.Model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
 public Student saveStudent(Student student) ;

 List<Student> getallStudents();

 Optional<Student> getByid(Long id);

 void deleteByid(Long id);
}
