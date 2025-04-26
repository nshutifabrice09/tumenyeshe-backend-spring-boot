package rw.tumenyeshe.reposirty;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.tumenyeshe.model.Zone;

import java.util.UUID;

public interface ZoneRepository extends JpaRepository <Zone, UUID> {
}
