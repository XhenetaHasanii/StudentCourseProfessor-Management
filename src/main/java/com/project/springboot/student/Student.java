package com.project.springboot.student;
import com.project.springboot.course.Course;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name ="Student")

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
    public Student() {
    }

    public Student(String firstName, String lastName, Long id, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.email = email;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Course> getCourseList() {
        return courses;
    }

    public void setCourseList(Set<Course> courseList) {
        this.courses = courseList;
    }


}
