package com.feedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.feedback.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {}
