package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.service.FeedbackService;

@RestController
@CrossOrigin("http://localhost:3000")
public class FeedbackController {

    private final FeedbackService feedbackService;

    @Autowired
    public FeedbackController (FeedbackService feedbackService){
        this.feedbackService = feedbackService;
    }
}
