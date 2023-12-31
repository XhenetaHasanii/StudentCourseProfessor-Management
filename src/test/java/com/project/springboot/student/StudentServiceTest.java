package com.project.springboot.student;
import com.project.springboot.course.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
    @Mock
    private StudentRepository studentRepository;
    private StudentService underTest;

    @BeforeEach
    void setUp() {

        underTest = new StudentService(studentRepository);
    }

    @Test
    void addStudent() {
        //given
        Set<Course> courses = new HashSet<>();
        StudentDTO student = StudentDTO.build("Xheneta", "Hasani", "xheneta.h@gmail.com", courses);
        //when
        underTest.saveStudent(student);
        //then
        ArgumentCaptor<Student> studentArgumentCaptor =
                ArgumentCaptor.forClass(Student.class);
        verify(studentRepository).
                save(studentArgumentCaptor.capture());
        Student studentCaptorValue = studentArgumentCaptor.getValue();
        /*assertThat(studentCaptorValue).isEqualTo(student)*/
    }

    @Test
    @Disabled
    void canGetAllStudents() {
        //when
        underTest.getAllStudents();
        //then
        verify(studentRepository).findAll();
    }

    @Test
    @Disabled
    void getStudentById() {
    }
}