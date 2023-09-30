package com.project.springboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course/v1/")
public class CourseController {
    CourseService courseService;
    @Autowired
   public CourseController(CourseService courseService){
       this.courseService=courseService;
   }
}
