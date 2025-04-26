package rw.tumenyeshe.exception;

import java.util.UUID;

public class ZoneNotFoundException extends RuntimeException{

    public ZoneNotFoundException (UUID id){
        super("Could not find a Zone with id "+id);
    }
}
