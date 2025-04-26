package rw.tumenyeshe.exception;

import java.util.UUID;

public class FeedbackNotFoundException extends RuntimeException{

    public FeedbackNotFoundException (UUID id){
        super ("Couldn't find a Feedback with id "+id);
    }
}
