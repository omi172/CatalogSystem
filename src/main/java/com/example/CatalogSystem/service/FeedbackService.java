package com.example.CatalogSystem.service;

import com.example.CatalogSystem.dto.FeedbackDto;
import com.example.CatalogSystem.model.Feedback;
import com.example.CatalogSystem.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public String saveFeedBack(FeedbackDto feedback){
           Feedback feedbackTemp = Feedback.builder()
                   .name(feedback.getName())
                   .bookName(feedback.getBookName())
                   .feedback(feedback.getFeedback())
                   .build();
           feedbackRepository.save(feedbackTemp);
           return "success";
    }
}
