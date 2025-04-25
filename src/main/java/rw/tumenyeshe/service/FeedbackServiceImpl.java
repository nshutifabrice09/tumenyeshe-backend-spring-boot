package rw.tumenyeshe.service;

import org.springframework.stereotype.Service;
import rw.tumenyeshe.model.Feedback;

import java.util.List;
import java.util.UUID;

@Service
public class FeedbackServiceImpl implements FeedbackService{
    @Override
    public List<Feedback> getAllFeedback() {
        return null;
    }

    @Override
    public Feedback getFeedbackById(UUID id) {
        return null;
    }

    @Override
    public Feedback saveFeedback(Feedback feedback) {
        return null;
    }

    @Override
    public Feedback updateFeedback(UUID id) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
