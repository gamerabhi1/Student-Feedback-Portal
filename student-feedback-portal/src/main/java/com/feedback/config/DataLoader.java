package com.feedback.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.feedback.model.Student;
import com.feedback.model.Course;
import com.feedback.model.Feedback;
import com.feedback.repository.StudentRepository;
import com.feedback.repository.CourseRepository;
import com.feedback.repository.FeedbackRepository;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(
        StudentRepository studentRepo,
        CourseRepository courseRepo,
        FeedbackRepository feedbackRepo
    ) {
        return args -> {

            // --- STUDENTS ---
            // Student s1 = new Student("Alice", "alice@gmail.com", "1234");
            // Student s2 = new Student("Bob", "bob@gmail.com", "1234");
            // Student s3 = new Student("Abhi", "abhi@gmail.com", "1345");
            // Student s4 = new Student("Rahul", "rahul@gmail.com", "1632");
            // Student s5 = new Student("Suman", "suman@gmail.com", "1578");
            
            // studentRepo.save(s1);
            // studentRepo.save(s2);
            // studentRepo.save(s3);
            // studentRepo.save(s4);
            // studentRepo.save(s5);

            // // --- COURSES ---
            // Course c1 = new Course("Java");
            // Course c2 = new Course("Python");
            // Course c3 = new Course("Aws");
            // Course c4 = new Course("C++");
            // Course c5 = new Course("Netbeans");
              
            // courseRepo.save(c1);
            // courseRepo.save(c2);
            // courseRepo.save(c3);
            // courseRepo.save(c4);
            // courseRepo.save(c5);


            // // --- FEEDBACK ---
            // Feedback f1 = new Feedback("Excellent course!", s1, c1);
            // Feedback f2 = new Feedback("Learned a lot!", s2, c2);
            // Feedback f3 = new Feedback("Learned a lot!", s3, c3);
            // Feedback f4 = new Feedback("Learned a lot!", s4, c4);
            // Feedback f5 = new Feedback("Learned a lot!", s5, c5);

            // feedbackRepo.save(f1);
            // feedbackRepo.save(f2);
            // feedbackRepo.save(f3);
            // feedbackRepo.save(f4);
            // feedbackRepo.save(f5);


            System.out.println("✅ Seed data inserted successfully!");
        };
    }
}