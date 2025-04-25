package rw.tumenyeshe.exception;

import java.util.UUID;

public class ReportCommentNotFoundException extends RuntimeException{

    public ReportCommentNotFoundException (UUID id){
        super ("Could not find a Report Comment with id "+id);
    }
}
