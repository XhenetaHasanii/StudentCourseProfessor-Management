package com.project.springboot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}