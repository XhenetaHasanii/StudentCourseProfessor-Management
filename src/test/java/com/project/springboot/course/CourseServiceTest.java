package com.project.springboot.course;
import com.project.springboot.student.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.verify;

class CourseServiceTest {
  @Mock
  private CourseRepository courseRepository;
 /*  CourseService underTest=new CourseService(courseRepository);*/
  private CourseService underTest;
  private  AutoCloseable closeable;
    @BeforeEach
    void setUp() {
        closeable=MockitoAnnotations.openMocks(this);
        underTest=new CourseService(courseRepository);
    }
    @AfterEach
    void tearDown() throws Exception {
        closeable.close();
    }
    @Test
    public void getAllStudents()
    {
        //when
        underTest.getAllCourses();
        //then
        verify(courseRepository).findAll();
    }
    @Test
    public void addCourse(){
        //given
        Set<Student> studentSet= new HashSet<>();
        Course course=new Course(1L,"MathCourse",studentSet);
        //when
        underTest.addNewCourse(course);
        //then
        ArgumentCaptor<Course> captorCourse=ArgumentCaptor.forClass(Course.class);
        verify(courseRepository).save(captorCourse.capture());
        Course capturedCourse= captorCourse.getValue();
        assertThat(capturedCourse).isEqualTo(course);

    }
}