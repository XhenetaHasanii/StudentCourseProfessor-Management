package com.project.springboot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/students")

public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping()
    public void createStudent(@RequestBody StudentDTO studentDTO) {
        studentService.addStudent(studentDTO);
        System.out.println(studentDTO);
    }
    @GetMapping("fetchAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @GetMapping("getStudent/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") Long id) {
        return studentService.getStudentById(id);
    }

}