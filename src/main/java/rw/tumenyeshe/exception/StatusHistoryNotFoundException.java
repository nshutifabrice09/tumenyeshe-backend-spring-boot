package rw.tumenyeshe.exception;

import java.util.UUID;

public class StatusHistoryNotFoundException extends RuntimeException{

    public StatusHistoryNotFoundException (UUID id){
        super("Could not find a Status History with id "+id);
    }
}
