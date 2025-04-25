package rw.tumenyeshe.exception;

import java.util.UUID;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException (UUID id){
        super("Could not a User with id "+id);
    }
}
