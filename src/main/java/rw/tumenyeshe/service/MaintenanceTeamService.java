package rw.tumenyeshe.service;

import rw.tumenyeshe.model.MaintenanceTeam;

import java.util.List;
import java.util.UUID;

public interface MaintenanceTeamService {

    List<MaintenanceTeam> getAllMaintenanceTeam();
    MaintenanceTeam getMaintenanceTeamById(UUID id);
    MaintenanceTeam saveMaintenanceTeam (MaintenanceTeam maintenanceTeam);
    MaintenanceTeam updateMaintenanceTeam (UUID id, MaintenanceTeam maintenanceTeam);
    void deleteById (UUID id);
}
