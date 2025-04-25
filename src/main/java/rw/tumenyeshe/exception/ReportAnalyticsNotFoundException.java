package rw.tumenyeshe.exception;

import java.util.UUID;

public class ReportAnalyticsNotFoundException extends RuntimeException{

    public ReportAnalyticsNotFoundException (UUID id){
        super ("Could not find a Report Analytics with id "+id);
    }
}
