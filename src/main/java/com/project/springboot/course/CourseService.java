package com.project.springboot.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    private CourseRepository courseRepository;
    @Autowired
    public  CourseService(CourseRepository courseRepository){
        this.courseRepository=courseRepository;
    }

    public void addNewCourse(Course course) {
        courseRepository.save(course);
        System.out.println(course);
    }
}
