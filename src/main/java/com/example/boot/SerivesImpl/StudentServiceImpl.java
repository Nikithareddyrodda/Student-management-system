package com.example.boot.SerivesImpl;

import com.example.boot.Model.Student;
import com.example.boot.Repositary.StudentRepository;
import com.example.boot.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getallStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getByid(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteByid(Long id) {
        studentRepository.deleteById(id);
    }
}
