package rw.tumenyeshe.reposirty;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.tumenyeshe.model.Location;

import java.util.UUID;

public interface LocationRepository extends JpaRepository<Location, UUID> {
}
