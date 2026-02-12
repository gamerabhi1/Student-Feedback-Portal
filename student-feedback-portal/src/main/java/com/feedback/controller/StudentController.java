package com.feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.feedback.model.Feedback;
import com.feedback.repository.CourseRepository;
import com.feedback.repository.FeedbackRepository;

@Controller
public class StudentController {

    @Autowired
    private CourseRepository courseRepo;

    @Autowired
    private FeedbackRepository feedbackRepo;

    // FEEDBACK PAGE
    @GetMapping("/feedback")
    public String feedbackPage(Model model) {
        model.addAttribute("courses", courseRepo.findAll());
        model.addAttribute("feedback", new Feedback());
        return "feedback";
    }

    // SUBMIT FEEDBACK + SUCCESS MESSAGE
    @PostMapping("/submitFeedback")
    public String submitFeedback(
            Feedback feedback,
            RedirectAttributes redirectAttributes) {

        feedbackRepo.save(feedback);

        // ✅ CONSOLE CONFIRMATION
        System.out.println("✅ Feedback submitted successfully");

        // ✅ UI SUCCESS MESSAGE
        redirectAttributes.addFlashAttribute(
                "success",
                "Feedback submitted successfully!");

        return "redirect:/feedback";
    }
}
