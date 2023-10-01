package com.project.springboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/course")
public class CourseController {
    CourseService courseService;
    @Autowired
    public CourseController(CourseService courseService){
       this.courseService=courseService;
   }
   @PostMapping()
   public void createNewCourse(@RequestBody  Course course){
        courseService.addNewCourse(course);
   }
   @GetMapping("getCourse/{id}")
   public Optional<Course> getStudentById(@PathVariable("id") Long id)
   {
       return courseService.findCourseById(id);
   }
}
