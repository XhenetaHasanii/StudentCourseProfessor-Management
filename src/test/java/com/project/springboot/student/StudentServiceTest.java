package com.project.springboot.student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    @Mock private StudentRepository studentRepository;
    private StudentService underTest;

    @BeforeEach
    void setUp() {

        underTest=new StudentService(studentRepository);
    }
    @Test
    @Disabled
    void addStudent() {
    }

    @Test
    void canGetAllStudents() {
         //when
        underTest.getAllStudents();
        //that
        verify(studentRepository).findAll();
    }

    @Test
    @Disabled
    void getStudentById() {
    }
}