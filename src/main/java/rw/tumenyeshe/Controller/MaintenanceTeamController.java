package rw.tumenyeshe.Controller;

import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.tumenyeshe.model.MaintenanceTeam;
import rw.tumenyeshe.service.MaintenanceTeamService;

import java.nio.channels.MulticastChannel;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class MaintenanceTeamController {

    private final MaintenanceTeamService maintenanceTeamService;

    @Autowired
    public MaintenanceTeamController (MaintenanceTeamService maintenanceTeamService){
        this.maintenanceTeamService = maintenanceTeamService;
    }

    @PostMapping("/maintenanceTeam")
    public MaintenanceTeam saveMaintenanceTeam(@RequestBody MaintenanceTeam maintenanceTeam){
        return maintenanceTeamService.saveMaintenanceTeam(maintenanceTeam);
    }

    @GetMapping("/maintenanceTeams")
    public List<MaintenanceTeam> maintenanceTeamList(){
        return maintenanceTeamService.getAllMaintenanceTeam();
    }

    @GetMapping("/maintenanceTeam/{id}")
    public MaintenanceTeam findById(@PathVariable ("id")UUID id){
        return maintenanceTeamService.getMaintenanceTeamById(id);
    }

    @PutMapping("/update/maintenanceTeam/{id}")
    public MaintenanceTeam updateMaintenanceTeam(@PathVariable ("id") UUID id, @RequestBody MaintenanceTeam maintenanceTeam){
        return maintenanceTeamService.updateMaintenanceTeam(id, maintenanceTeam);
    }

    @DeleteMapping("/delete/maintenanceTeam/{id}")
    public void deleteById(@PathVariable ("id")UUID id){
        maintenanceTeamService.deleteById(id);
    }
}
