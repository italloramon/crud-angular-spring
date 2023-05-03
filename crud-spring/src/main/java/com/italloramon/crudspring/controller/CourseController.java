package com.italloramon.crudspring.controller;

import com.italloramon.crudspring.model.Course;
import com.italloramon.crudspring.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseRepository courseRepository;
    @GetMapping
    public List<Course> listAll() {
        return courseRepository.findAll();
    }
}
