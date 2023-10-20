package com.project.springboot.student;
import com.project.springboot.course.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import static  org.assertj.core.api.Assertions.*;
@DataJpaTest
class StudentRepositoryTest
{
   private final StudentRepository underTest;
   @Autowired
    StudentRepositoryTest(StudentRepository underTest) {
        this.underTest = underTest;
    }
    @Test
    void itShouldCheckIfStudentExistsById()
    {
        Set<Course> courses=new HashSet<>();
        //given
        Student student=new Student(3L,"Xheneta","Hasani","xheneta.h@gmail.com",
              courses);
        underTest.save(student);
        //when
        Optional<Student> optionalStudent =underTest.getStudentById(student.getId());
        //then
       assertThat(optionalStudent).isPresent();
    }
    @Test
    void itShouldCheckIfStudentDoesNotExistsById()
    {
        //given
        Long id=3L;
        //when
        Optional<Student> optionalStudent= underTest.getStudentById(id);
      //then
        assertThat(optionalStudent).isEmpty();
    }
}