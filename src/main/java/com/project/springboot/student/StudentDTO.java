package com.project.springboot.student;

import com.project.springboot.course.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.Set;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class StudentDTO {
    //Validation input
    @NotNull(message = "firstName shouldn't be null")
    private String firstName;
    private String lastName;
    @Min(18)
    @Max(60)
    private Integer age;
    @Email(message = "invalid email entered")
    private String email;
    @Pattern(regexp = "^\\d{10}",message="invalid number entered")
    private Integer mobile;
    @NotBlank
    private Set<Course> courses;
}
