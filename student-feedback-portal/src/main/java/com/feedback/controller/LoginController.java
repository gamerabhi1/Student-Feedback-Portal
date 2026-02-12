package com.feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.feedback.model.Student;
import com.feedback.repository.StudentRepository;

@Controller
public class LoginController {

    @Autowired
    private StudentRepository studentRepo;

    // LOGIN PAGE
    @GetMapping("/")
    public String loginPage(Model model) {
        return "login";
    }

    // LOGIN LOGIC
    @PostMapping("/login")
    public String loginStudent(
            @RequestParam String email,
            @RequestParam String password,
            Model model) {

        Student student = studentRepo.findByEmailAndPassword(email, password);

        if (student != null) {
            model.addAttribute("student", student);
            return "dashboard";
        } else {
            model.addAttribute("error", "Invalid Email or Password");
            return "login";
        }
    }

    // REGISTER PAGE
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    // REGISTER LOGIC + SUCCESS MESSAGE
    @PostMapping("/register")
    public String registerStudent(
            Student student,
            RedirectAttributes redirectAttributes) {

        studentRepo.save(student);

        // ✅ CONSOLE CONFIRMATION
        System.out.println("✅ Student registered successfully: " + student.getEmail());

        // ✅ UI SUCCESS MESSAGE
        redirectAttributes.addFlashAttribute(
                "success",
                "Student registered successfully! Please login.");

        return "redirect:/";
    }
}
