package com.project.springboot.course;
import com.project.springboot.professor.Professor;
import com.project.springboot.student.Student;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity()
@Table(name="course")
public class Course {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "course_id")
   private Long id;
   private String courseTitle;
   @ManyToMany(fetch = FetchType.LAZY,mappedBy = "courses")
   private Set<Student> studentList=new HashSet<>();
    public Course() {
    }

    public Course(Long id, String courseTitle, Professor professor) {
        this.id = id;
        this.courseTitle = courseTitle;
       /* this.professor = professor;*/
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Set<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Set<Student> studentList) {
        this.studentList = studentList;
    }

/*    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseTitle='" + courseTitle + '\'' +
                ", studentList=" + studentList +
                ", professor=" + professor +
                '}';
    }*/
}
