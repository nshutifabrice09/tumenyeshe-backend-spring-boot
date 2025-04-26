package rw.tumenyeshe.exception;

import java.util.UUID;

public class LocationNotFoundException extends RuntimeException{

    public LocationNotFoundException (UUID id){
        super ("Could not find a Location with id "+id);
    }
}
