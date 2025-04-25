package rw.tumenyeshe.exception;

import java.util.UUID;

public class IntegrationNotFoundException extends RuntimeException{
    public IntegrationNotFoundException (UUID id){
        super ("Couldn't find an Integration with "+id);
    }
}
