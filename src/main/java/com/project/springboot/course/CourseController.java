package com.project.springboot.course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(path="api/v1/course")
public class CourseController {
   private final CourseService courseService;
    @Autowired
    public CourseController(CourseService courseService)
    {
       this.courseService=courseService;
   }
   @PostMapping()
   public void createNewCourse(@RequestBody  Course course)
   {
        courseService.addNewCourse(course);
   }
   @GetMapping("getAllCourse/courses")
   public List<Course> courseList()
   {
       return courseService.getAllCourses();
   }
   @GetMapping("getCourse/{id}")
   public Optional<Course> getCourseById(@PathVariable("id") Long id)
   {
       return courseService.findCourseById(id);
   }




}
