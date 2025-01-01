package com.st.learn_spring_boot.controller;

import com.st.learn_spring_boot.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> retriveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn GCP","subhashTech"),
                new Course(2,"Learn DevOps","subhashTech"),
                new Course(3,"Learn Java","subhashTech")
        );
    }
}
