package com.project.springboot.student;

import org.hibernate.bytecode.internal.bytebuddy.PassThroughInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService)
    {
        this.studentService=studentService;
    }
    @PostMapping()
    public  void createStudent(@RequestBody Student student){
       studentService.addStudent(student);
       System.out.println(student);

    }
    @GetMapping("getStudent/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") Long id )
    {
       return studentService.getStudentById(id);
    }

}