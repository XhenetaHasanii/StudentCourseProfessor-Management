package com.project.springboot.student;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    @Mock
    StudentRepository studentRepository;
    StudentService underTest;

    @BeforeEach
    void  setUp(){
        MockitoAnnotations.openMocks(this);
        underTest=new StudentService(studentRepository);
    }
    @AfterEach


    @Test
    @Disabled
    void addStudent() {
    }

    @Test
    void getAllStudents() {
    }

    @Test
    @Disabled
    void getStudentById() {
    }
}