package rw.tumenyeshe.reposirty;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.tumenyeshe.model.StatusHistory;

import java.util.UUID;

public interface StatusHistoryRepository extends JpaRepository <StatusHistory, UUID>  {
}
