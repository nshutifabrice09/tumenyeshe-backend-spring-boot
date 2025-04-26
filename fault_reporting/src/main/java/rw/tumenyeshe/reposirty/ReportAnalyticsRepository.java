package rw.tumenyeshe.reposirty;

import org.springframework.data.jpa.repository.JpaRepository;
import rw.tumenyeshe.model.ReportAnalytics;

import java.util.UUID;

public interface ReportAnalyticsRepository extends JpaRepository <ReportAnalytics, UUID> {
}
