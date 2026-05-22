package com.example.CatalogSystem.repository;

import com.example.CatalogSystem.model.Feedback;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeedbackRepository extends MongoRepository<Feedback,String> {
}
