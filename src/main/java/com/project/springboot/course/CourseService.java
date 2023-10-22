package com.project.springboot.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class CourseService {

    private final CourseRepository courseRepository;
    @Autowired
    public  CourseService(CourseRepository courseRepository)
    {
        this.courseRepository=courseRepository;
    }
    public void addNewCourse(Course course)
    {
        courseRepository.save(course);
        System.out.println(course);
    }
    public List<Course> getAllCourses()
    {
        return courseRepository.findAll();
    }
    public Optional<Course> findCourseById(Long id) {
      return courseRepository.findById(id);
    }
}
