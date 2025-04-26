package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import rw.tumenyeshe.service.MaintenanceTeamService;

@RestController
@CrossOrigin("http://localhost:3000")
public class MaintenanceTeamController {

    private final MaintenanceTeamService maintenanceTeamService;

    @Autowired
    public MaintenanceTeamController (MaintenanceTeamService maintenanceTeamService){
        this.maintenanceTeamService = maintenanceTeamService;
    }
}
