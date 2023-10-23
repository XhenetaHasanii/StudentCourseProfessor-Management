package com.project.springboot.student;

import com.project.springboot.course.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class StudentDTO {
    private String firstName;
    private  String lastName;
    private String email;
    private Set<Course> courses;
}
