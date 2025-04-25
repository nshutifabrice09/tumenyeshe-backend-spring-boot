package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.tumenyeshe.model.FaultReport;
import rw.tumenyeshe.model.Feedback;
import rw.tumenyeshe.service.FeedbackService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class FeedbackController {

    private final FeedbackService feedbackService;

    @Autowired
    public FeedbackController (FeedbackService feedbackService){
        this.feedbackService = feedbackService;
    }

    @PostMapping("/feedback")
    public Feedback saveFeedback(@RequestBody Feedback feedback){
        return feedbackService.saveFeedback(feedback);
    }

    @GetMapping("/feedbacks")
    public List<Feedback> feedbackList(){
        return feedbackService.getAllFeedback();
    }

    @GetMapping("/feedback/{id}")
    public Feedback findById(@PathVariable ("id")UUID id){
        return feedbackService.getFeedbackById(id);
    }

    @PutMapping("/update/feedback/{id}")
    public Feedback updateFeedback (@PathVariable ("id") UUID id, @RequestBody Feedback feedback){
        return feedbackService.updateFeedback(id, feedback);
    }

    @DeleteMapping("/delete/feedback/{id}")
    public void deleteById(@PathVariable ("id") UUID id){
        feedbackService.deleteById(id);
    }

}
