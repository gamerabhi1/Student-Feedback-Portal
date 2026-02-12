package com.feedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.feedback.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {}
