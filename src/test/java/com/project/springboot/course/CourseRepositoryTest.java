package com.project.springboot.course;
import com.project.springboot.student.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.*;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
@DataJpaTest
class CourseRepositoryTest {
    private final CourseRepository underTest;
    @Autowired
    CourseRepositoryTest(CourseRepository underTest) {
        this.underTest = underTest;
    }
    @Test
    void itShouldCheckIfCourseExistsById()
    {
        Set<Student> students=new HashSet<>();
        //given
        Course course=new Course(1L,"Java Course",students);
        underTest.save(course);
        //when
        Optional<Course> optionalCourse =underTest.findCourseById(course.getId());
        //then
        assertThat(optionalCourse).isPresent();
    }
    @Test
    void itShouldCheckIfCourseDoesNotExistsById()
    {
        //given
        Long id=1L;
        //when
        Optional<Course> optionalCourse=underTest.findCourseById(id);
        //then
        assertThat(optionalCourse).isEmpty();

    }
}