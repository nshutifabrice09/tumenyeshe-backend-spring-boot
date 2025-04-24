package rw.tumenyeshe.reposirty;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.tumenyeshe.model.FaultReport;

import java.util.UUID;

public interface FaultReportRepository extends JpaRepository<FaultReport, UUID> {
}
