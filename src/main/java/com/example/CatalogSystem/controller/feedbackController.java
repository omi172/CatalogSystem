package com.example.CatalogSystem.controller;

import com.example.CatalogSystem.model.Feedback;
import com.example.CatalogSystem.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.CatalogSystem.dto.FeedbackDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class feedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/feedback")
    public String showForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "feedback-form";
    }

    @PostMapping("/feedback")
    public String submitForm(@ModelAttribute("Feedback") FeedbackDto feedback, Model model) {
        feedbackService.saveFeedBack(feedback);
        // This string binds directly to the th:text="${message}" placeholder above
        model.addAttribute("message", "Thank you, " + feedback.getName() + "! Your review for '" + feedback.getBookName() + "' has been saved.");
        return "feedback-success";
    }
}
