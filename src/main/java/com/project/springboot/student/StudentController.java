package com.project.springboot.student;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(path = "api/v1/student")

public class StudentController
{
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }

    @PostMapping()
    public  void createStudent(@RequestBody Student student){
       studentService.addStudent(student);
       System.out.println(student);

    }
    @GetMapping("getAllStudent/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("getStudent/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") Long id )
    {
       return studentService.getStudentById(id);
    }

}