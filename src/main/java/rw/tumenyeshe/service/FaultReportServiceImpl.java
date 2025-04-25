package rw.tumenyeshe.service;

import org.springframework.stereotype.Service;
import rw.tumenyeshe.model.FaultReport;

import java.util.List;
import java.util.UUID;

@Service
public class FaultReportServiceImpl implements FaultReportService{
    @Override
    public List<FaultReport> getAllFaultReport() {
        return null;
    }

    @Override
    public FaultReport getFaultReportById(UUID id) {
        return null;
    }

    @Override
    public FaultReport saveFaultReport(FaultReport faultReport) {
        return null;
    }

    @Override
    public FaultReport updateFaultReport(UUID id, FaultReport faultReport) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
