package com.project.springboot.course;

import com.project.springboot.student.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor

public class CourseDTO
{

    private String courseTitle;
    private Set<Student> studentList;

}
