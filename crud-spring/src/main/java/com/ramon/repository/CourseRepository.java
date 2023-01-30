package com.ramon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramon.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
