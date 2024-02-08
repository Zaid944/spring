package com.introduction.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"A","random1"),
                new Course(2,"B","random2"),
                new Course(3,"C","random3"),
                new Course(4,"D","random4")
        );
    }
}
