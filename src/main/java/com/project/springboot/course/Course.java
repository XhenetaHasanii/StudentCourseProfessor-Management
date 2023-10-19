package com.project.springboot.course;
import com.project.springboot.student.Student;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity()
@Table(name="course")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Course {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "course_id")
   private Long id;
   private String courseTitle;
   @ManyToMany(fetch = FetchType.LAZY,mappedBy = "courses")
   private Set<Student> studentList=new HashSet<>();
}


