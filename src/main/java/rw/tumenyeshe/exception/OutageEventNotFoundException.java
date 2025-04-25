package rw.tumenyeshe.exception;

import java.util.UUID;

public class OutageEventNotFoundException extends RuntimeException{

    public OutageEventNotFoundException (UUID id){
        super ("Could not find an Outage Event with id "+id);
    }
}
