package com.project.springboot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    @Autowired
    StudentService (StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    public void saveStudent(Student student){
        studentRepository.save(student);
    }

}
