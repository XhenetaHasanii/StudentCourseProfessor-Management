package com.project.springboot.student;
import com.project.springboot.course.Course;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @ManyToMany(targetEntity = Course.class,cascade = CascadeType.ALL)
    private Set<Course> courses=new HashSet<>();

}
