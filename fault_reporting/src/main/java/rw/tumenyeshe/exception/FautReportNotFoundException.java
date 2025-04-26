package rw.tumenyeshe.exception;

import java.util.UUID;

public class FautReportNotFoundException extends RuntimeException{

    public FautReportNotFoundException (UUID id){
        super("Couldn't find a Fault Report with id "+id);
    }
}
