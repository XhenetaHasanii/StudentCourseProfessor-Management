package com.project.springboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
