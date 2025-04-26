package rw.tumenyeshe.reposirty;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.tumenyeshe.model.OutageEvent;

import java.util.UUID;

public interface OutageEventRepository extends JpaRepository <OutageEvent, UUID> {
}
