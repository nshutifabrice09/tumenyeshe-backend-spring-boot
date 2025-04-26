package rw.tumenyeshe.exception;

import java.util.UUID;

public class AssignmentNotFoundException extends RuntimeException{

    public AssignmentNotFoundException (UUID id){
        super ("Couldn't find an Assignment with id "+id);
    }
}
