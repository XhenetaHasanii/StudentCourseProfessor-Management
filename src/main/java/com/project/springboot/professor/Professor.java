package com.project.springboot.professor;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.springboot.course.Course;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "professor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "professor_id")
    private Long id;
    private String positionTitle;
    private String firstName;
    private String lastName;
    private String email;

    public Professor(String positionTitle, String firstName, String lastName, String email) {
        this.positionTitle = positionTitle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }




}
