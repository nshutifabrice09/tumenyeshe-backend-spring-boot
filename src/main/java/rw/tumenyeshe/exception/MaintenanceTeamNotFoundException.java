package rw.tumenyeshe.exception;

import java.util.UUID;

public class MaintenanceTeamNotFoundException extends RuntimeException{

    public MaintenanceTeamNotFoundException (UUID id){
        super("Could not find a Maintenance Team with id "+id);
    }
}
