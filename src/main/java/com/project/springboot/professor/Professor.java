package com.project.springboot.professor;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.springboot.course.Course;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "professor")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "professor_id")
    private Long id;
    private String positionTitle;
    private String firstName;
    private String lastName;
    private String email;
   /* @JsonProperty("collection")
    @JsonFormat
    @OneToMany(mappedBy = "professor",
    cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Course>courseList=new ArrayList<>();*/

    public Professor() {
    }

    public Professor(String positionTitle, String firstName, String lastName, String email) {
        this.positionTitle = positionTitle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPositionTitle() {
        return positionTitle;
    }
    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
/*    public List<Course> getCourseList() {
        return courseList;
    }
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }*/


}
