package com.project.springboot.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/students")

public class StudentController {

    private final StudentService studentService;

    @Autowired
    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public ResponseEntity<Student> addStudent(@RequestBody @Valid StudentDTO studentDTO) {
        return new ResponseEntity<>(studentService.saveStudent(studentDTO), HttpStatus.CREATED);
    }

    @GetMapping("fetchAll")
    public ResponseEntity<List<Student>> getAllStudents() {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("my-custom-header", "my-custom-value");
        return new ResponseEntity<>(studentService.getAllStudents(), responseHeaders, 200);

        /*return ResponseEntity.ok(studentService.getAllStudents());*/
    }

    @GetMapping("getStudent/{id}")
    public ResponseEntity<Optional<Student>> getStudentById(@PathVariable("id") Long id) {

        return ResponseEntity.ok(studentService.getStudentById(id));
    }

}