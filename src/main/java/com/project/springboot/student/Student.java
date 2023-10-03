package com.project.springboot.student;
import com.project.springboot.course.Course;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
   @JoinTable(name = "Student_Course_Table",joinColumns = {
          @JoinColumn(name = "student_id")}
           ,inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> courses=new HashSet<>();

    public Student(String firstName,String lastName,String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }


}
