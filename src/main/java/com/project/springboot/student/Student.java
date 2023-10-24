package com.project.springboot.student;

import com.project.springboot.course.Course;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "STUDENT_TBL")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Getter

public class Student
{
    @Getter
    @Id
    @GeneratedValue
    private Long studentId;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private Integer mobile;
    @ManyToMany(targetEntity = Course.class, cascade = CascadeType.ALL)
    private Set<Course> courses = new HashSet<>();

}
