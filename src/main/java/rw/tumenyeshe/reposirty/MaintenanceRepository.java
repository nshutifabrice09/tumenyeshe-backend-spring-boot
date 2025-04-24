package rw.tumenyeshe.reposirty;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.tumenyeshe.model.MaintenanceTeam;

import java.util.UUID;

public interface MaintenanceRepository extends JpaRepository<MaintenanceTeam, UUID> {
}
