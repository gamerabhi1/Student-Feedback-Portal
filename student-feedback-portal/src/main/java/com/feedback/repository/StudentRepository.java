package com.feedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.feedback.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmailAndPassword(String email, String password);
}
