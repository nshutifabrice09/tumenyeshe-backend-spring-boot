package rw.tumenyeshe.service;

import rw.tumenyeshe.model.FaultReport;

import java.util.List;
import java.util.UUID;

public interface FaultReportService {
    List<FaultReport> getAllFaultReport();
    FaultReport getFaultReportById(UUID id);
    FaultReport saveFaultReport (FaultReport faultReport);
    FaultReport updateFaultReport (UUID id, FaultReport faultReport);
    void deleteById (UUID id);
}
