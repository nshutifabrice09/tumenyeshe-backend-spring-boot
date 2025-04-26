package rw.tumenyeshe.exception;

import java.util.UUID;

public class AdminActingNotFoundException extends RuntimeException{

    public AdminActingNotFoundException (UUID id){
        super("Couldn't find an Admin Acting Log with id "+id);
    }
}
