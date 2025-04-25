package rw.tumenyeshe.service;

import rw.tumenyeshe.model.Feedback;

import java.util.List;
import java.util.UUID;

public interface FeedbackService {
    List<Feedback> getAllFeedback();
    Feedback getFeedbackById(UUID id);
    Feedback saveFeedback (Feedback feedback);
    Feedback updateFeedback (UUID id, Feedback feedback);
    void deleteById (UUID id);
}
