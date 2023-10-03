package com.project.springboot.studentCourse;

import com.project.springboot.course.CourseRepository;
import com.project.springboot.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student/course")
public class StudentCourseController {
    StudentRepository studentRepository;
    CourseRepository courseRepository;
    @Autowired
    StudentCourseController(StudentRepository studentRepository,CourseRepository courseRepository){
        this.studentRepository=studentRepository;
        this.courseRepository=courseRepository;
    }
}
