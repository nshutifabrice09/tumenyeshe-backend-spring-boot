package rw.tumenyeshe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rw.tumenyeshe.model.FaultReport;
import rw.tumenyeshe.service.FaultReportService;
import rw.tumenyeshe.service.FeedbackService;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("http://localhost:3000")
public class FaultReportController {

    private final FaultReportService faultReportService;

    @Autowired
    public FaultReportController (FaultReportService faultReportService){
        this.faultReportService = faultReportService;
    }

    @PostMapping("/faultReport")
    public FaultReport saveFaultReport(@RequestBody FaultReport faultReport){
        return faultReportService.saveFaultReport(faultReport);
    }

    @GetMapping("/faultReports")
    public List<FaultReport> faultReportList(){
        return faultReportService.getAllFaultReport();
    }

    @GetMapping("/faultReport/{id}")
    public FaultReport findById(@PathVariable ("id")UUID id){
        return faultReportService.getFaultReportById(id);
    }

    @PutMapping("/update/faultReport/{id}")
    public FaultReport updateFaultReport (@PathVariable ("id") UUID id, @RequestBody FaultReport faultReport){
        return faultReportService.updateFaultReport(id, faultReport);
    }

}
