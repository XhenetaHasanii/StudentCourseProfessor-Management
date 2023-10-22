package com.project.springboot.course;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

class CourseServiceTest {
  @Mock
  private CourseRepository courseRepository;
 /*  CourseService underTest=new CourseService(courseRepository);*/
    CourseService underTest;
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
        //that
        verify(courseRepository).findAll();

    }
}