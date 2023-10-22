package com.project.springboot.professor;
import lombok.*;
import javax.persistence.*;
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






}
