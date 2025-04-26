package rw.tumenyeshe.service;

import rw.tumenyeshe.model.ReportAnalytics;

import java.util.List;
import java.util.UUID;

public interface ReportAnalyticsService {

    List<ReportAnalytics> getAllReportAnalytics();
    ReportAnalytics getReportAnalyticsById(UUID id);
    ReportAnalytics saveReportAnalytics (ReportAnalytics reportAnalytics);
    ReportAnalytics updateReportAnalytics (UUID id, ReportAnalytics reportAnalytics);
    void deleteById (UUID id);
}
